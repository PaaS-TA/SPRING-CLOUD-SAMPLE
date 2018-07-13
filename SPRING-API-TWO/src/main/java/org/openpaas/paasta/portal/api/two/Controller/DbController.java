package org.openpaas.paasta.portal.api.two.Controller;

import org.openpaas.paasta.portal.api.two.Entity.ServicepackCategory;
import org.openpaas.paasta.portal.api.two.Service.DbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RestController
 * Spring 4.0 부터 추가된 어노테이션 으로 @Controller와 @ResponseBody 가 함깨 포함되어있다.
 */
@RestController
public class DbController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbController.class);

    @Autowired
    private DbService dbService;

    /**
     * GetMapping
     * Spring 4.3 부터 추가된 어노테이션 으로 @RequestMapping 를 좀더 간편하게 만들 수 있는 어노테이션이다.
     */
    @GetMapping(value = { "/servicePackCatalog/list"})
    public Map getServicePackCatalogList(HttpServletRequest request) throws Exception {
        LOGGER.info("############# getServicePackCatalogList Start #############");
        List<ServicepackCategory> resultList = dbService.getServicePackCatalogList();
        Map rs = new HashMap();
        rs.put("result", resultList);
        return rs;
    }

}
