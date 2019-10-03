package advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.aop.AfterReturningAdvice;

import bussiness.bank;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class logAfter implements org.aopalliance.intercept.MethodInterceptor

{
@Override
public Object invoke(MethodInvocation str) throws Throwable {
	
	Log l=LogFactory.getLog(bank.class);
	l.info("Before Advice");
	Object obj=str.proceed();
	l.info("After Advice");
	
	return obj;
}
}
