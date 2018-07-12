package org.openpaas.paasta.portal.api.one;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@EnableCircuitBreaker
@SpringBootApplication
public class ApiOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOneApplication.class, args);
	}
}
