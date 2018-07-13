package org.openpaas.paasta.portal.api.two;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

/**
 * EnableCircuitBreaker
 * Circuit breaker 를 사용한다.
 *
 * SpringBootApplication
 * Configuration, EnableAutoConfiguration, ComponetScan 이 포함되어있다.
 */
@EnableCircuitBreaker
@SpringBootApplication
public class ApiTwoApplication {
    /**
     * Storage API entry point.
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(ApiTwoApplication.class, args);
	}
}
