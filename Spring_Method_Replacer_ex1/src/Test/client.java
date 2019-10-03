package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bank;

public class client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		Bank bk=(Bank)ap.getBean("b");
		bk.CalInt();
		bk.deposit();
		bk.withdrow();
	}
}
