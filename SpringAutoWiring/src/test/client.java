package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.test;

public class client {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
	test te=(test)ap.getBean("t");
	te.disp();
	}
}
