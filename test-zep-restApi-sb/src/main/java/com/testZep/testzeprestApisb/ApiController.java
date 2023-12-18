package com.testZep.testzeprestApisb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping(value = "/api/test", method = RequestMethod.GET )
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() { // JSON방식으로 String자료형 선택
        return "{\"result\":\"ok\"}";
//        return "ok";
    }
    // localhost:8080/api/test
}
