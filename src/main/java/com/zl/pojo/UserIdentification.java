package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserIdentification implements Serializable{
    /**
	 * 身份证表
	 */
	private static final long serialVersionUID = 6452668557796525923L;

	private String identificationId; //身份证号

    private Integer userId;  //用户id

    private String userName; //姓名

    private String userSex; //性别
 
    private String userNation; 

    private String userAddress; //身份证地址

    private String signAgency; //签署机关

    private Date startTime; //开始时间

    private Date endTime; //结束时间

    private String frontImg;  //身份证正面

    private String backImg; //身份证被面

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

	public String getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getSignAgency() {
		return signAgency;
	}

	public void setSignAgency(String signAgency) {
		this.signAgency = signAgency;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFrontImg() {
		return frontImg;
	}

	public void setFrontImg(String frontImg) {
		this.frontImg = frontImg;
	}

	public String getBackImg() {
		return backImg;
	}

	public void setBackImg(String backImg) {
		this.backImg = backImg;
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
		return "UserIdentification [identificationId=" + identificationId + ", userId=" + userId + ", userName="
				+ userName + ", userSex=" + userSex + ", userNation=" + userNation + ", userAddress=" + userAddress
				+ ", signAgency=" + signAgency + ", startTime=" + startTime + ", endTime=" + endTime + ", frontImg="
				+ frontImg + ", backImg=" + backImg + ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4
				+ ", a5=" + a5 + "]";
	}

}