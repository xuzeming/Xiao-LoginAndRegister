package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserCentersMapper;
import com.zl.pojo.UserCenters;
import com.zl.service.IUserCentersService;
@Service
public class UserCentersServiceImpl implements IUserCentersService {
	@Autowired
	private UserCentersMapper userCentersMapper;


	//查询手机号是否存在
	public int selByPho(String phone) {
		return userCentersMapper.selByPho( phone);
	}

	//注册
	public void addUserCenters(String phone) {
		userCentersMapper.addUserCenters(phone);
	}
	
	//查询用户名是否存在
	public UserCenters selByName(String userLoginName) {
		return userCentersMapper.selByName(userLoginName);
	}

	//加入用户名和密码
	public void upUserCenters(UserCenters userCenters) {
		userCentersMapper.upUserCenters(userCenters);
		
	}

	//查询用户名和密码是否存在
	public UserCenters queryByNameAndPw(String userLoginName,String userPwd) {
		return userCentersMapper.queryByNameAndPw(userLoginName,userPwd);
	}

	//查询用户名或手机号是否存在
	public UserCenters selByNameOrPhone(String userLoginName) {
		return userCentersMapper.selByNameOrPhone(userLoginName);
	}

	//修改密码
	public void upPwd(String userTel,String userPwd,String accountNum) {
		userCentersMapper.upPwd(userTel,userPwd,accountNum);
		
	}

	//查询资金账户是否存在
	public String selfund(Integer accountNum, String userName, String identificationId) {
		return userCentersMapper.selfund(accountNum,userName,identificationId);
		
	}

	//找回资金账号
	public String findAccountNum(String userTel, String userName, String identificationId) {
		
		return userCentersMapper.findAccountNum(userTel,userName,identificationId);
	}

}
