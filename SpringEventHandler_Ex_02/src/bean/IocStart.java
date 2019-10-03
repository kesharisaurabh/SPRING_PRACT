package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IocStart implements ApplicationListener<ContextStartedEvent>
{
	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
	UserClass uc=new UserClass("User Started The Class Execution");
	uc.disp();
	}
}
