package org.openpaas.paasta.portal.api.one.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiOneConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiOneConfiguration.class);

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
