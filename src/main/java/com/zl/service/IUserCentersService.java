package com.zl.service;

import com.zl.pojo.UserCenters;

public interface IUserCentersService {
	//查询手机号是否存在
	int selByPho(String phone);
	//手机号注册
	void addUserCenters(String phone);
	//查询用户名是否存在
	UserCenters selByName(String userLoginName);
	//加入用户名和密码
	void upUserCenters(UserCenters userCenters);
	//查询用户名和密码是否存在
	UserCenters queryByNameAndPw(String userLoginName, String userPwd);
	//查询用户名或手机号是否存在
	UserCenters selByNameOrPhone(String userLoginName);
	//修改密码
	void upPwd(String userTel, String userPwd, String accountNum);
	//查询资金账户是否存在
	String selfund(Integer accountNum, String userName, String identificationId);
	//找回资金账号
	String findAccountNum(String userTel, String userName, String identificationId);
	
	

}
