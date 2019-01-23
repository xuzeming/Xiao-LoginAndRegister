package com.zl.web;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.RestData;
import com.zl.redis.RedisUtil;
import com.zl.service.IUserCentersService;
import com.zl.util.RestTest;

@Controller
@RequestMapping("/code")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CodeController {
	private RestData restData=new RestData();
	@Autowired
	private IUserCentersService userCentersService;
	//生成手机验证码	
			@RequestMapping("/getCode.action")
			@ResponseBody
			public String code(String phone) throws IOException {
				String code = RestTest.sendPhone(phone, "1");
				String prefix = UUID.randomUUID().toString();
				RedisUtil.setCachePrefix(prefix);
				//存储一个key ,value
				RedisUtil.setString(phone, code,180);
				System.err.println(RedisUtil.getString(phone));
				return "phoneRegister";
			}
	//手机验证码比较	
			@RequestMapping("/compareCode.action")
			@ResponseBody
			public RestData ecode(String code,String phone){
				System.out.println(phone);
				 String str = RedisUtil.getString(phone);//获取redis里的code
				 System.out.println(str);
				if (!code.equals(str)) { //用户验证码与生成的验证码之间的比较
					restData.setRight("error");
					restData.setError("验证码错误!");
				}else {
					restData.setRight("No");
					RedisUtil.del(phone);
					//注册
					userCentersService.addUserCenters(phone);	
				}
				return restData;
			}
			
}
