package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Stud 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.hbm.xml");
		Student st=(Student)ap.getBean("st");
		st.helloStudent("Welcome");
	}
}
