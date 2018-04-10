package cn.african.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.african.service.UserService;

public class TestAOP {
	
	@Test
	public void demo01() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//获取目标类
		UserService userService = context.getBean("userService", UserService.class);
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
		context.getClass().getMethod("close").invoke(context);
	}
}