package org.openpaas.paasta.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * EnableHystrix
 * Hystrix 를 사용한다.
 *
 * EnableZuulProxy
 * EnableZuulProxy 는 EnableZuulServer 가 포함되있는 것이고, zuul 서버를 구축한다.
 *
 * EnableDiscoveryClient
 * EurekaClient 를 등록한다.
 *
 * SpringBootApplication
 * Configuration, EnableAutoConfiguration, ComponetScan 이 포함되어있다.
 */
@EnableHystrix
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}

