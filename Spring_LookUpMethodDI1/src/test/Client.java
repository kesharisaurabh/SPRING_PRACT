package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.IMS;
import bean.LNCT;
import bean.SCSIT;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		
		IMS im=(IMS)ap.getBean("ims");
		im.IMS_CLG().disp();
		
		LNCT ln=(LNCT)ap.getBean("lnct");
		ln.LNCT_CLG().disp();
		
		SCSIT scs=(SCSIT)ap.getBean("scsit");
		scs.SCSIT_CLG().disp();
	}
}
