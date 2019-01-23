package com.zl.web;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.RestData;
import com.zl.pojo.UserCenters;
import com.zl.redis.RedisUtil;
import com.zl.service.IUserCentersService;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
		private int count=0;
		private RestData restData=new RestData();
		@Autowired
		private IUserCentersService userCentersService;
		
//查询手机号是否存在
		@RequestMapping("/selPhone.action")
		@ResponseBody
		public RestData selPhone(String phone) {
			int count=userCentersService.selByPho(phone);
			if(count>=1) {
				restData.setError("该手机已被注册!");
				restData.setRight("...");
				System.err.println(restData.getRight());
			}else {
				restData.setRight("No");
			}
			return restData;
		}

		
//查询用户名是否存在并插入用户名和密码
		@RequestMapping("/registerN.action")
		@ResponseBody
		public RestData register(UserCenters userCenters) {
			UserCenters usercent=userCentersService.selByName(userCenters.getUserLoginName());
			if(usercent!=null) {
				restData.setError("该用户名已存在!");
				restData.setRight("...");		
			}else {	
				restData.setRight("No");
				userCentersService.upUserCenters(userCenters);
			}
			return restData;
		}
//查询用户是否存在并登录	
		@RequestMapping("/login.action")
		@ResponseBody
		public RestData loginName(String userLoginName,String userPwd,HttpSession session,String check,HttpServletResponse resp) throws Exception {
			//查询用户名或手机号是否存在
			UserCenters user = userCentersService.selByNameOrPhone(userLoginName);
			if (user==null) {
				restData.setRight("...");
				restData.setError("用户名错误!");
			}else {
			//如果存在 查询用户名密码是否匹配
			// 输入错误拦截
			 String str = RedisUtil.getString(userLoginName);
			 //如果输入错误超过3次则该账户一分钟内不能登录
			 if ("4".equals(str)) {
				 RedisUtil.setString(userLoginName,"4",60);
				 restData.setRight("1");
				 restData.setError("该账户密码错误次数超过三次!请1分钟后再登!");
				return restData;
			}
			UserCenters userCenters = userCentersService.queryByNameAndPw(userLoginName,userPwd);		
			//如果userLoginName不匹配
			if (userCenters==null) {
				count++;
				RedisUtil.setString(userLoginName,count+""); //将用户名作为键创建redis 值自增
				restData.setRight("...");
				restData.setError("用户名或密码错误!");		
			}else {
				restData.setRight("No");
				session.setAttribute("user", userCenters);
				//保存密码
				if ("on".equals(check)) {
					Cookie nameCookie=new Cookie("uname",URLEncoder.encode(userCenters.getUserLoginName(), "utf-8"));
					Cookie pawCookie=new Cookie("paw",URLEncoder.encode(userCenters.getUserPwd(), "utf-8"));
					nameCookie.setPath("/");
					pawCookie.setPath("/");
					nameCookie.setMaxAge(7*24*3600);
					pawCookie.setMaxAge(7*24*3600);
					resp.addCookie(nameCookie);
					resp.addCookie(pawCookie);
				}else {
					Cookie nameCookie=new Cookie("uname",null);
					Cookie pawCookie=new Cookie("paw",null);
					nameCookie.setPath("/");
					pawCookie.setPath("/");
					nameCookie.setMaxAge(0);
					pawCookie.setMaxAge(0);
					resp.addCookie(nameCookie);
					resp.addCookie(pawCookie);
				}	
			}
		}
			return restData;
	}
//获取user		
		@RequestMapping("/getUser.action")
		@ResponseBody
		public UserCenters loginName(HttpSession session) {
			UserCenters userCenters = (UserCenters) session.getAttribute("user");
			return userCenters;
		}
//用户退出
		@RequestMapping("/removeSession.action")	
		public String removeSession(HttpSession session) {
			session.invalidate();
			return "redirect:/login.html";
		}
//管理员退出
		@RequestMapping("/remove.action")	
		public String remove(HttpSession session) {
			session.invalidate();
			return "redirect:/guanliyuandenglu.html";
		}
}
