package Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext cfg=new ClassPathXmlApplicationContext("resources/Spring.xml");
		cfg.start();
		cfg.stop();
		cfg.refresh();
		cfg.close();
	}
}
