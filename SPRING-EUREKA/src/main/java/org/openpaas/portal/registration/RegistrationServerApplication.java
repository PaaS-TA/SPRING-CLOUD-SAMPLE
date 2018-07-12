package org.openpaas.portal.registration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * All you need to run a Eureka registration server.
 * 
 * @author Paul Chapman
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class RegistrationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegistrationServerApplication.class, args);
	}
}
