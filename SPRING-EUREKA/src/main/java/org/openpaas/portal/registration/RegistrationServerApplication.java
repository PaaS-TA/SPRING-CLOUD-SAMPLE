package org.openpaas.portal.registration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringBootApplication
 * Configuration, EnableAutoConfiguration, ComponetScan 이 포함되어있다.
 *
 * EnableEurekaServer
 * EurekaServer 로 사용 할것을 선언한다.
 *
 * EnableDiscoveryClient
 * EurekaClient 를 등록한다.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class RegistrationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegistrationServerApplication.class, args);
	}
}
