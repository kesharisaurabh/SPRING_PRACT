package Test;

import org.springframework.aop.framework.ProxyFactoryBean;

import Bussiness.bank;
import Services.Sevice_loger;

public class client 
{
	public static void main(String[] args) {
		bank bk=new bank();
		Sevice_loger lbf= new Sevice_loger();
		ProxyFactoryBean pfbBean=new ProxyFactoryBean();
		pfbBean.setTarget(bk);
		pfbBean.addAdvice(lbf);
		
		bank bank1=(bank)pfbBean.getObject();
		int amount=bank1.deposit("sbi1234", 5000);
		System.out.println(amount);
	}
}
