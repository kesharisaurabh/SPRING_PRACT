package bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class IocStopEvent implements ApplicationListener<ContextStoppedEvent>
{
	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("Event Stoped");
	}
}
