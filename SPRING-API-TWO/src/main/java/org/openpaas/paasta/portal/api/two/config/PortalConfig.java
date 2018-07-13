package org.openpaas.paasta.portal.api.two.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Configuration, Bean
 * 컨테이너에 새로운 Bean 객체를 만든다.
 *
 * EnableJpaRepositories
 * Jpa 에서 사용될 Repository 의 위치 지정과, 설정을 정의한다.
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "org.openpaas.paasta.portal.api.two.repository",
        entityManagerFactoryRef = "portalEntityManager",
        transactionManagerRef = "portalTransactionManager"
)
public class PortalConfig {

    private static final Logger logger = getLogger(PortalConfig.class);

    /**
     * Value
     * 프로퍼티값을 가져온다.
     */
    @Value("${datasource.portal.driver-class-name}") String portalDriverClassName;
    @Value("${datasource.portal.url}") String portalUrl;
    @Value("${datasource.portal.username}") String portalUsername;
    @Value("${datasource.portal.password}") String portalPassword;
    @Value("${jpa.hibernate.ddl-auto}") String ddlAuto;
    @Value("${jpa.hibernate.naming.strategy}") String dialect;


    @Bean
    public boolean loggerPrintConfig() {


        logger.info("[PotalConfig]=====================================================================");
        logger.info("[PotalConfig]=====================================================================");
        logger.info("[PotalConfig]=====================================================================");
        logger.info("[PotalConfig]=====================================================================");
        logger.info(portalDriverClassName+" portalDriverClassName");
        logger.info(portalUrl+" portalUrl");
        logger.info(portalUsername+" portalUsername");
        logger.info(portalPassword+" portalPassword");
        logger.info(ddlAuto+" PotalddlAuto");
        logger.info(dialect+" Potaldialect");
        logger.info("==================================================================================");


        return true;
    }


    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean portalEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(portalDataSource());
        em.setPackagesToScan(new String[] { "org.openpaas.paasta.portal.api.two.Entity" });

        HibernateJpaVendorAdapter vendorAdapter= new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",ddlAuto);//validate
        properties.put("hibernate.dialect",dialect);    //hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Primary
    @Bean
    public DataSource portalDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(portalDriverClassName);
        portalUrl = "jdbc:mysql://115.68.46.219:3306/test";
        portalUsername = "root";
        portalPassword = "!paas_ta202";
        dataSource.setUrl(portalUrl);
        dataSource.setUsername(portalUsername);
        dataSource.setPassword(portalPassword);
        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager portalTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(portalEntityManager().getObject());
        return transactionManager;
    }

}
