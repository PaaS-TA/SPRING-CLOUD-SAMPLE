package org.openpaas.paasta.portal.api.one.Controller;


import org.openpaas.paasta.portal.api.one.Service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * RestController
 * Spring 4.0 부터 추가된 어노테이션 으로 @Controller와 @ResponseBody 가 함깨 포함되어있다.
 */
@RestController
public class ExamController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExamController.class);

    @Autowired
    ExamService examService;

    /**
     * GetMapping
     * Spring 4.3 부터 추가된 어노테이션 으로 @RequestMapping 를 좀더 간편하게 만들 수 있는 어노테이션이다.
     */
    @GetMapping(value = { "/apps/{index}/summary"})
    public Map apps(@PathVariable String index, HttpServletRequest request) throws Exception {
        LOGGER.info("apps Start : " + index);
        Map rs = examService.getApps(index);
        return rs;
    }


}
