package spring_day01;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations="classpath:beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestIoC {
	
	@Test
	public void demo01() {
		
		
	}
}
