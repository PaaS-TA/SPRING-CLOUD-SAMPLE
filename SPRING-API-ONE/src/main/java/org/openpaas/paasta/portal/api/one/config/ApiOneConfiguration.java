package org.openpaas.paasta.portal.api.one.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration, Bean
 * 컨테이너에 새로운 Bean 객체를 만든다.
 */
@Configuration
public class ApiOneConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiOneConfiguration.class);

    /**
     * Value
     * 프로퍼티값을 가져온다.
     */
    @Value("${dashboard}")
    String dashboard;


    @Bean
    public boolean print(){
        LOGGER.info("#############################################");
        LOGGER.info("#############################################");
        LOGGER.info("#############################################");
        LOGGER.info(dashboard);
        LOGGER.info("#############################################");
        LOGGER.info("#############################################");
        LOGGER.info("#############################################");
        return false;
    }

}
