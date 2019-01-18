package com.zl.pojo;

import java.io.Serializable;


import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 7821265922639882000L;
	private Integer id;
	private String  username;
	private String  password;
	private String  sex ;
	private Integer  age;
	private Integer  sid=1;
	private String  phone;
	private String  idcard;
	private Integer deleteFlag;
	private Date  inserttime;
	private Date  updatetime;
	private Integer  cid;
	private Integer  usertype;
	private Double fenshu;
	public Double getFenshu() {
		return fenshu;
	}
	public void setFenshu(Double fenshu) {
		this.fenshu = fenshu;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Date getInserttime() {
		return inserttime;
	}
	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
