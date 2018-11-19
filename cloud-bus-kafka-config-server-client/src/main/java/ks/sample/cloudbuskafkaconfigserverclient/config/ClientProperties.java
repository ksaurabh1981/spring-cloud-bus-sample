package ks.sample.cloudbuskafkaconfigserverclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ClientProperties {
	@Value("${welcome: default msg}")
	private String welcomeMsg;
	
	@Value("${service1.message: default service1.message}")
	private String service1Msg;

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

	public String getService1Msg() {
		return service1Msg;
	}

	public void setService1Msg(String service1Msg) {
		this.service1Msg = service1Msg;
	}
	
	
	
}
