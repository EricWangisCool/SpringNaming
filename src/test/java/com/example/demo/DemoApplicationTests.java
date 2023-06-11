package com.example.demo;

import com.example.demo.mainFunction.entity.UserBean;
import com.example.demo.mainFunction.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Test
	void test() {
		UserBean userBean = userRepository.findOneByUserId(1);
		System.out.println(userBean.getUserId());
		System.out.println(userBean.getUserName());

		System.out.println(userRepository.findUserNameByUserId(1));
	}

}
