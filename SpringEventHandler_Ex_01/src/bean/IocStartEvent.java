package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IocStartEvent implements ApplicationListener<ContextStartedEvent> 
{
	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		System.out.println("EventStarted");
	}
}
