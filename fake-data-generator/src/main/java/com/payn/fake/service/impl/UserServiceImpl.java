package com.payn.fake.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.payn.fake.entity.User;
import com.payn.fake.mapper.UserMapper;
import com.payn.fake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public PageInfo<User> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum, pageSize);
		List<User> userDomains = userMapper.selectUsers();
		PageInfo result = new PageInfo(userDomains);
		return result;
	}
}
