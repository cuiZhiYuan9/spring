package org.springframework.mybatis.service;

import org.springframework.mybatis.entity.User;

import java.util.List;

public interface UserService {

	List<User> test(String id);
}
