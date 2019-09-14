package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c=(Car)ap.getBean("c");
		c.print();
	}
}
