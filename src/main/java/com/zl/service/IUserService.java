package com.zl.service;


import com.zl.pojo.User;

public interface IUserService {
	User login(String username, String password);
}
