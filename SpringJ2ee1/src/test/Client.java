 package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.student;

public class Client
{
	public static void main(String[] args) 
	{
		 
		ApplicationContext fac=new ClassPathXmlApplicationContext("resources/spring.xml");
		Object o=fac.getBean("t");
		Object o1=fac.getBean("t");
		Object o2=fac.getBean("t");
		
		
		student st=(student)o;
		st.hello();
		
	}
}
