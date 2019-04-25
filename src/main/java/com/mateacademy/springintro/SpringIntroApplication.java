package com.mateacademy.springintro;

import com.mateacademy.springintro.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:context.xml");
		User user = (User) context.getBean("user");
		User userPrototype = (User) context.getBean("user");

		User singleton = (User) context.getBean("singleton");
		User other = (User) context.getBean("singleton");

		System.out.println(singleton.equals(other));
		context.registerShutdownHook();
	}

}
