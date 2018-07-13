package org.openpaas.paasta.portal.api.one.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Service
 * 해당 클래스가 Service라는 것을 명시한다.
 */
@Service
public class ExamService {

    /**
     * HystrixCommand
     * Circuit breaker 와 연동되며, 서버별 request 빈도 및 응답속도 측정으로 서버 상태 파악.
     */
    @HystrixCommand(commandKey = "getApps")
    public Map getApps(String index) {
        Map rs = new HashedMap();
        if (index.equals("1")) {
            rs.put("result", "app index :: 1");
        } else if (index.equals("2")) {
            rs.put("result", "app index :: 2");
        } else {
            rs.put("result", "error");
        }
        return rs;
    }


}
