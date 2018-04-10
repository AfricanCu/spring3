package cn.african.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.african.service.AccountService;

public class TestApp {
	
	@Test
	public void demo01() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService = context.getBean("accountService", AccountService.class);
		accountService.transfer("jack", "rose", 1000);
		context.getClass().getMethod("close").invoke(context);
	}
}
