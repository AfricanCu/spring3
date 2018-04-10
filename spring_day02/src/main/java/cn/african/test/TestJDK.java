package cn.african.test;

import org.junit.Test;

import cn.african.factory.MyBeanFactory;
import cn.african.service.UserService;

public class TestJDK {
	
	@Test
	public void demo01() {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
//		userService.updateUser();
//		userService.deleteUser();
	}

}
