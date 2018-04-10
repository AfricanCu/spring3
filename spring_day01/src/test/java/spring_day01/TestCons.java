package spring_day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.african.domain.User;

public class TestCons {
	
	@Test
	public void demo01() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user);
		context.getClass().getMethod("close").invoke(context);
	}

}
