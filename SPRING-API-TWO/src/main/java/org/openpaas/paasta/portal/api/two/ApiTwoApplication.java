package org.openpaas.paasta.portal.api.two;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

/**
 * PaaS-TA Storage API application. 
 * (org.openpaas.paasta.portal.storage.api)
 * 
 * @author hgcho (Hyungu Cho)
 * @version 
 * @since 2018. 4. 2.
 *
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
