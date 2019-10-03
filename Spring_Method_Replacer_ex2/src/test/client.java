package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.StudentProp;

public class client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		
		StudentProp st=(StudentProp)ap.getBean("stdprop");
		
		st.stuId();
		
		st.name();
		
		st.SurName();
	}
}
