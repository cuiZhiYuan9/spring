package org.springframework.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mybatis.entity.User;
import org.springframework.mybatis.mapper.UserMapper;
import org.springframework.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
//	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> test(String id) {
		return userMapper.select(id);
	}
}
