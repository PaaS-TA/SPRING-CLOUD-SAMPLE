package org.openpaas.paasta.portal.api.one.Controller;


import org.openpaas.paasta.portal.api.one.Service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ExamController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExamController.class);

    @Autowired
    ExamService examService;

    @GetMapping(value = { "/apps/{index}/summary"})
    public Map apps(@PathVariable String index, HttpServletRequest request) throws Exception {
        LOGGER.info("apps Start : " + index);
        Map rs = examService.getApps(index);
        return rs;
    }


}
