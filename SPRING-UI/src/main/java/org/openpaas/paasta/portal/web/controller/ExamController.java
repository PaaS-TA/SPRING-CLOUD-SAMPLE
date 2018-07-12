package org.openpaas.paasta.portal.web.controller;

import com.sun.tools.javac.util.List;
import org.openpaas.paasta.portal.web.service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;
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
        LOGGER.info("eurekaIndex :: " + index);
        Map rs = examService.eurekaRest("CLOUDAPIONE/apps/" + index + "/summary", HttpMethod.GET, null);
        return rs;
    }

    @GetMapping(value = {"/zuul/{index}"})
    public Map zuulIndex(@PathVariable String index, HttpServletRequest request) {
        LOGGER.info("eurekaIndex :: " + index);
        Map rs = examService.zuulRest("cloudapione/apps/" + index + "/summary", HttpMethod.GET, null);
        return rs;
    }

}
