package org.openpaas.paasta.portal.web.controller;


import org.openpaas.paasta.portal.web.service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Login Controller
 *
 * @author nawkm
 * @version 1.0
 * @since 2016.4.4 최초작성
 */
@Controller
@RestController
public class ExamController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExamController.class);


    @Autowired
    ExamService examService;


    @GetMapping(value = {"/eureka/{index}"})
    public Map eurekaIndex(@PathVariable String index, HttpServletRequest request) {
        LOGGER.info("eurekaIndex start");
        LOGGER.info("eurekaIndex :: " + index);
        Map rs = examService.eurekaRest("CLOUDAPIONE/apps/" + index + "/summary", HttpMethod.GET, null);
        return rs;
    }

    @GetMapping(value = {"/zuul/{index}"})
    public Map zuulIndex(@PathVariable String index, HttpServletRequest request) {
        LOGGER.info("zuulIndex start");
        LOGGER.info("eurekaIndex :: " + index);
        Map rs = examService.zuulRest("cloudapione/apps/" + index + "/summary", HttpMethod.GET, null);
        return rs;
    }

    @GetMapping(value = {"/eureka/servicePackCatalog/list"})
    public Map eurekaGetServicePackCatalogList(HttpServletRequest request) {
        LOGGER.info("eurekaGetServicePackCatalogList start");
        Map rs = examService.eurekaRest("CloudApiTwo/servicePackCatalog/list", HttpMethod.GET, null);
        return rs;
    }

    @GetMapping(value = {"/zuul/servicePackCatalog/list"})
    public Map zuulGetServicePackCatalogList(HttpServletRequest request) {
        LOGGER.info("zuulGetServicePackCatalogList start");
        Map rs = examService.zuulRest("CloudApiTwo/servicePackCatalog/list", HttpMethod.GET, null);
        return rs;
    }

}
