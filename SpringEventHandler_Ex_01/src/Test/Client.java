package Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		cap.start();
		cap.refresh();
		cap.stop();
		cap.refresh();
		cap.close();
		cap.refresh();
	}
}
