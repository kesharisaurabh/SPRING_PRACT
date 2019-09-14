package test;

import java.lang.reflect.Constructor;

public class Client 
{
	public static void main(String[] args) 
	{
		try {
			Class c=Class.forName("beans.test");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance(null);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
