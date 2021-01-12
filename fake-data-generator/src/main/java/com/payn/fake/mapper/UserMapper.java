package com.payn.fake.mapper;


import com.payn.fake.entity.User;

import java.util.List;

public interface UserMapper {

	int insert(User record);

	List<User> selectUsers();
}