package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class client
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		Car cr=(Car)ap.getBean("c");
		System.out.println(cr.MyCar().getName());
		
		Bus bus=(Bus)ap.getBean("b");
		System.out.println(bus.BusEngine().getName());
		
		Truck tk=(Truck)ap.getBean("t");
		System.out.println(tk.TruckEng().getName());
	}
}
