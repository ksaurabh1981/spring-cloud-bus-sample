package ks.sample.cloudbuskafkaproducerdemo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomRemoteEventListener implements ApplicationListener<MyCustomRemoteEvent> {

	@Override
	public void onApplicationEvent(MyCustomRemoteEvent event) {
		
		System.out.println("Received Message ::: "+event.getMessage());
	}

}
