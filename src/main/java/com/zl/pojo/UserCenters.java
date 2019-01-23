package com.zl.pojo;

import java.io.Serializable;


public class UserCenters implements Serializable {
    /**
	 * 用户中心表
	 */
	private static final long serialVersionUID = -7166156739500196360L;
	private Integer userId; //用户ID
  
    private Integer userStatusId; //用户状态ID（0注销，1正常，2冻结）

    private String userLoginName;//用户名

    private String netName; //网名

    private String userTel; //用户绑定手机号

    private String userPwd;//登录账号密码

    private Integer accountNum;//资金账号

    private String capitalPwd; //资金密码

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserStatusId() {
		return userStatusId;
	}

	public void setUserStatusId(Integer userStatusId) {
		this.userStatusId = userStatusId;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getNetName() {
		return netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public String getCapitalPwd() {
		return capitalPwd;
	}

	public void setCapitalPwd(String capitalPwd) {
		this.capitalPwd = capitalPwd;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	@Override
	public String toString() {
		return "UserCenters [userId=" + userId + ", userStatusId=" + userStatusId + ", userLoginName=" + userLoginName
				+ ", netName=" + netName + ", userTel=" + userTel + ", userPwd=" + userPwd + ", accountNum="
				+ accountNum + ", capitalPwd=" + capitalPwd + ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4
				+ ", a5=" + a5 + "]";
	}

   
}