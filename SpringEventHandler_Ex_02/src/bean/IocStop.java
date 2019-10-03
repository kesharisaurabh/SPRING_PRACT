package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class IocStop implements ApplicationListener<ContextStoppedEvent>
{
	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
			UserClass uc=new UserClass("User Stoped The Class Execution");
			uc.disp();
		}
}
