package com.payn.fake;

import com.github.javafaker.Faker;
import com.payn.fake.entity.User;
import com.payn.fake.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest01 {

	@Autowired
	private UserServiceImpl userService;

	@Test
	public void fakeDataInsert() {
		Faker faker = new Faker();
		for (int i = 0; i < 50; i++) {
			String name = faker.name().fullName(); // Miss Samanta Schmidt
			String password = faker.name().firstName(); // Emory
			String phoneNumber = faker.phoneNumber().phoneNumber();
			User user = new User();
			user.setUserName(name);
			user.setPassword(password);
			user.setPhone(phoneNumber);

			System.out.println(i + "::" + user.toString());
			userService.addUser(user);
		}
	}
}
