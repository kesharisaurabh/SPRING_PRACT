package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import Service.MethodBeforeService;
import bussiness.bank;

public class client 
{
	public static void main(String[] args) 
	{
		bank b=new bank();
		MethodBeforeService mbs=new MethodBeforeService();
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(mbs);
		bank bpro=(bank)pfb.getObject();
		int amt=bpro.deposit(5000, "sbi123");
		System.out.println(amt);
		
	}
}
