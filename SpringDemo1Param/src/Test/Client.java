package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Bank;

public class Client 
{
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.hbm.xml");
		Bank bank=(Bank)ap.getBean("bo");
		bank.hello("saurabh  ");
		Bank bank1=(Bank)ap.getBean("boc");
		
	}
}
