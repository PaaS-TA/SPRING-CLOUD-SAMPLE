package org.openpaas.paasta.portal.api.two.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.openpaas.paasta.portal.api.two.Controller.DbController;
import org.openpaas.paasta.portal.api.two.Entity.ServicepackCategory;
import org.openpaas.paasta.portal.api.two.repository.ServicepackCategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service
 * 해당 클래스가 Service라는 것을 명시한다.
 */
@Service
public class DbService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbService.class);

    @Autowired
    ServicepackCategoryRepository servicepackCategoryRepository;

    /**
     * HystrixCommand
     * Circuit breaker 와 연동되며, 서버별 request 빈도 및 응답속도 측정으로 서버 상태 파악.
     */
    @HystrixCommand(commandKey = "getServicePackCatalogList")
    public List<ServicepackCategory> getServicePackCatalogList() {
        LOGGER.info("getServicePackCatalogList service in ");
        return servicepackCategoryRepository.findAll();
    }

}
