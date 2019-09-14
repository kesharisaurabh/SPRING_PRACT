 package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.student;

public class Client
{
	public static void main(String[] args) 
	{
		Resource r=new ClassPathResource("resources/spring.xml");
		BeanFactory fac=new XmlBeanFactory(r);
		Object o=fac.getBean("t");
		Object o1=fac.getBean("t");
		Object o2=fac.getBean("t");
		
		
		student st=(student)o;
		st.hello();
		
	}
}
