package advice;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.aop.AfterReturningAdvice;

import bussiness.bank;

public class logAfter implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		Log l=LogFactory.getLog(bank.class);
		l.info("After returning Advice");
		
	}
}
