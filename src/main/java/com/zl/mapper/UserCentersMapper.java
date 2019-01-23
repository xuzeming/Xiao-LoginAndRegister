package com.zl.mapper;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.UserCenters;


public interface UserCentersMapper {

	int selByPho(String phone);
	
	void addUserCenters(String phone);
	
	UserCenters selByName(String userLoginName);

	void upUserCenters(UserCenters userCenters);

	UserCenters queryByNameAndPw(@Param(value="userLoginName")String userLoginName,@Param(value="userPwd")String userPwd);

	UserCenters selByNameOrPhone(String userLoginName);

	void upPwd(@Param(value="userTel")String userTel, @Param(value="userPwd")String userPwd, @Param(value="accountNum")String accountNum);

	String selfund(@Param(value="accountNum")Integer accountNum,@Param(value="userName") String userName, @Param(value="identificationId")String identificationId);

	String findAccountNum(@Param(value="userTel")String userTel,@Param(value="userName") String userName,@Param(value="identificationId")String identificationId);

}
