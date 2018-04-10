package spring_day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.african.domain.Person;

public class TestSetter {
	
	@Test
	public void demo01() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		context.getClass().getMethod("close").invoke(context);
	}

}
