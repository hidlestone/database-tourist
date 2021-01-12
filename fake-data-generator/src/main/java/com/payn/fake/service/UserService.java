package com.payn.fake.service;

import com.github.pagehelper.PageInfo;
import com.payn.fake.entity.User;

public interface UserService {

	int addUser(User user);

	PageInfo<User> findAllUser(int pageNum, int pageSize);
}
