package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserAccount implements Serializable{
    /**
	 * 资金账户表
	 */
	private static final long serialVersionUID = 763286222898858343L;

	private Integer accountId;//资金账号ID

    private Integer userId;//用户ID

    private Integer accountNum; //资金账号

    private Integer accountBalance; //资金账号余额

    private Date accountOpenTime;//开户时间

    private String capitalPwd; //资金密码

    private Integer orgId; //营业厅ID

    private  Integer SHAccountNum; //上海证券账户账号
    
    private  Integer SZAccountNum;//深圳证券账户账号

    public Integer getSHAccountNum() {
		return SHAccountNum;
	}

	public void setSHAccountNum(Integer sHAccountNum) {
		SHAccountNum = sHAccountNum;
	}

	public Integer getSZAccountNum() {
		return SZAccountNum;
	}

	public void setSZAccountNum(Integer sZAccountNum) {
		SZAccountNum = sZAccountNum;
	}

	private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getAccountOpenTime() {
		return accountOpenTime;
	}

	public void setAccountOpenTime(Date accountOpenTime) {
		this.accountOpenTime = accountOpenTime;
	}

	public String getCapitalPwd() {
		return capitalPwd;
	}

	public void setCapitalPwd(String capitalPwd) {
		this.capitalPwd = capitalPwd;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
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
		return "UserAccount [accountId=" + accountId + ", userId=" + userId + ", accountNum=" + accountNum
				+ ", accountBalance=" + accountBalance + ", accountOpenTime=" + accountOpenTime + ", capitalPwd="
				+ capitalPwd + ", orgId=" + orgId + ", SHAccountNum=" + SHAccountNum + ", SZAccountNum=" + SZAccountNum
				+ ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}


    
}