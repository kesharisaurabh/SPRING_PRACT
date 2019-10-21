package Service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import bussiness.bank;

public class MethodBeforeService implements MethodBeforeAdvice
{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		Log l=LogFactory.getLog(bank.class);
		l.info("Deposit Method");
	}


}
