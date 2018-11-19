package ks.sample.cloudbuskafkaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudBusKafkaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBusKafkaConfigServerApplication.class, args);
	}
}
