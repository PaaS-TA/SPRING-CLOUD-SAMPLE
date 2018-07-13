package org.openpaas.paasta.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller
 * Controller 임을 선언한다.
 */
@Controller
public class mainController {

    /**
     * GetMapping
     * Spring 4.3 부터 추가된 어노테이션 으로 @RequestMapping 를 좀더 간편하게 만들 수 있는 어노테이션이다.
     */
    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
