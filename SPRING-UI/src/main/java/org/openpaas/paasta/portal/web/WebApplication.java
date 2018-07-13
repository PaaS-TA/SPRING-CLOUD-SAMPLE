package org.openpaas.paasta.portal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * SpringBootApplication
 * Configuration, EnableAutoConfiguration, ComponetScan 이 포함되어있다.
 *
 * EnableDiscoveryClient
 * EurekaClient 를 등록한다.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebApplication extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
