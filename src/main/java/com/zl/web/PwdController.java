package com.zl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.RestData;
import com.zl.pojo.UserCenters;
import com.zl.service.IUserCentersService;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class PwdController {
	@Autowired
	private IUserCentersService userCentersService;
	private RestData restData=new RestData();
	//查询用户名是否存在,如果存在查出该用户手机号
			@RequestMapping("/selName.action")
			@ResponseBody
			public String register(String userLoginName) {
				 UserCenters userCenters = userCentersService.selByNameOrPhone(userLoginName);
				if (userCenters!=null) {
					return userCenters.getUserTel();		
				}else {	
					return "该用户名不存在!";
				}
			}
	//找回资金账号
			@RequestMapping("/findAccountNum.action")
			@ResponseBody
			public RestData findAccountNum(String userTel,String userName,String identificationId) {
				 String accountNum = userCentersService.findAccountNum(userTel,userName,identificationId);
				 if (accountNum==null) {
						restData.setRight("err");
						restData.setError("信息填写错误,没有与您填写的信息匹配的账号!请填写正确的信息!");
					}else {
						restData.setRight(accountNum);
					}
					return restData;				
			}
	
	//查询资金账户是否存在
			@RequestMapping("/fund.action")
			@ResponseBody
			public RestData fund(Integer accountNum,String userName,String identificationId) {
				 String fund = userCentersService.selfund(accountNum,userName,identificationId);
				 if (fund==null) {
						restData.setRight("...");
						restData.setError("该账户不存在,请重新输入!");
					}else {
						restData.setRight("No");
					}
					return restData;
			}
			
			//修改密码
			@RequestMapping("/upPwd.action")
			@ResponseBody
			public RestData upPwd(String userTel,String userPwd,String accountNum) {
				 userCentersService.upPwd(userTel,userPwd,accountNum);
				 return restData;
			}
}
