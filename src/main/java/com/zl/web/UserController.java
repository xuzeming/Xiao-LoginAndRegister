package com.zl.web;

import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zl.pojo.User;
import com.zl.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	/**
	 * 1.登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/login.action")
	@ResponseBody
	public String login(String username,String password,HttpSession session) throws UnsupportedEncodingException{
		User user = userService.login(username,password);
		if (user!=null) {//
			session.setAttribute("user", user);
			return "success";
		}else{
			return "fail";
		}
	}
}
