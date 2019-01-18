package com.zl.mapper;

import com.zl.pojo.User;
public interface UserMapper {

	User selectByUsernameAndPassword(String username, String password);
	
}
