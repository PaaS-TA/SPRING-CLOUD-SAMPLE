package org.openpaas.paasta.infraadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBootApplication
 * Configuration, EnableAutoConfiguration, ComponetScan 이 포함되어있다.
 *
 * EnableAdminServer
 * AdminServer 로 사용 할것을 선언한다.
 *
 * EnableDiscoveryClient
 * EurekaClient 를 등록한다.
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}

