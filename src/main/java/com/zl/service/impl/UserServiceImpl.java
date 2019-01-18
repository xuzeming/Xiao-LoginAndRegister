package com.zl.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zl.mapper.UserMapper;
import com.zl.pojo.User;
import com.zl.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(String username, String password) {
		return userMapper.selectByUsernameAndPassword(username,password);
	}
}
