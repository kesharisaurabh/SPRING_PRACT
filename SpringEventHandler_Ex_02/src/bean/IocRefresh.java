package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IocRefresh implements ApplicationListener<ContextRefreshedEvent>
{
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		UserClass uc=new UserClass("User Refereshed Event");
		uc.disp();
		
	}
}
