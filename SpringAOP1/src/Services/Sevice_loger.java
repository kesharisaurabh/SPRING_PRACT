package Services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import Bussiness.bank;

public class Sevice_loger implements MethodBeforeAdvice
{
	public void before(Method m,Object[] parm,Object o)throws Throwable
	{
		Log l=LogFactory.getLog(bank.class);
		l.info("Deposite Method");
	}
}