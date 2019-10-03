package bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class newName implements MethodReplacer
{
	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("Honey");
		return null;
	}
}
