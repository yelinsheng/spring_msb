package com.itcast.spring.aop.around;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 叶林生 
* @date：2017年7月9日 上午10:54:09
* @version 1.0
* 
*/
public class TestAround {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/itcast/spring/aop/around/bean.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.getUserDao().add(null);
	}

}
