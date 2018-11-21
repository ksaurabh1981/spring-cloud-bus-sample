package ks.sample.cloudbuskafkaproducerdemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudRestController {

	ApplicationContext context;

	@Autowired
	public CloudRestController(ApplicationContext context) {
		this.context = context;
	}
	
	@RequestMapping(value="/publish", method=RequestMethod.PUT)
	public String publishMessage() {
		//each service instace must have unique context ID
		//String myUniqueId1 = context.;
		String myUniqueId = "";
	   
		MyCustomRemoteEvent myCustomEvent = new MyCustomRemoteEvent(this, myUniqueId, "Hello World !!!");
		//context.publishEvent(myCustomEvent);
	    
		return "Event published successfully";
	}
}
