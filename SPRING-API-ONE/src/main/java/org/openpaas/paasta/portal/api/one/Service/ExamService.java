package org.openpaas.paasta.portal.api.one.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExamService {


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
