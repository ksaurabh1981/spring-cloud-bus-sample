package ks.sample.cloudbuskafkaconfigserverclient.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ks.sample.cloudbuskafkaconfigserverclient.config.ClientProperties;

@RestController
public class TestApi {
	Logger logger = LoggerFactory.getLogger(TestApi.class);
	@Autowired
	private ClientProperties prop;
	
	@RequestMapping(value="testConfig", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.ALL_VALUE)
	public String testConfigServer() {
		logger.info("Calling testConfig api value returned is : {} <=> {}", prop.getWelcomeMsg(), prop.getService1Msg());
		return prop.getWelcomeMsg()+" "+prop.getService1Msg();
	}
}
