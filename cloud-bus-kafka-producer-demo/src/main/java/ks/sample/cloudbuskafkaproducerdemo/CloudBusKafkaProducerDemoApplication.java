package ks.sample.cloudbuskafkaproducerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan
public class CloudBusKafkaProducerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBusKafkaProducerDemoApplication.class, args);
	}
}
