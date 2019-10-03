package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IocClosed implements ApplicationListener<ContextClosedEvent>
{
	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		UserClass uc=new UserClass("User CLosed The Event Thanku....See U Soon");
		uc.disp();
	}
}
