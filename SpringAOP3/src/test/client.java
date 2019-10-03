package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import advice.logAfter;
import bussiness.bank;

public class client 
{
	public static void main(String[] args) {
		bank b=new bank();
		logAfter af=new logAfter();
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(af);
		bank bn=(bank)pfb.getObject();
		int amount=bn.deposit("sbi123",3000);
		System.out.println(amount);
		
	}
}
