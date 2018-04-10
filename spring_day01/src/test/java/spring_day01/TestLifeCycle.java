package spring_day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.african.service.UserService;

public class TestLifeCycle {
	
	@Test
	public void demo01() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService bean = context.getBean("userService", UserService.class);
		bean.addUser();
		context.getClass().getMethod("close").invoke(context); 
	}
	
	@Test
	public void demo02() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService bean = context.getBean("userService", UserService.class);
		bean.addUser();
		context.getClass().getMethod("close").invoke(context); 
	}
}
