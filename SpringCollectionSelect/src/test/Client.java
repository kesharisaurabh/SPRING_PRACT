package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.TestBean;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		TestBean tb=(TestBean)ap.getBean("t");
		tb.Hello();
		
	
	}
}
