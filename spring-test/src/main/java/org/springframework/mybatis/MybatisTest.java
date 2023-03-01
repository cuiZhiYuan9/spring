package org.springframework.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mybatis.configuration.ConfigMybatis;
import org.springframework.mybatis.entity.User;
import org.springframework.mybatis.service.UserService;

import java.util.Arrays;
import java.util.List;

public class MybatisTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		List<User> select = applicationContext.getBean(UserService.class).test("1");
		select.forEach(System.out::println);

		System.out.println(Arrays.toString(ConfigMybatis.class.getAnnotations()));
		System.out.println(ConfigMybatis.class.getAnnotation(Import.class));


	}
}
