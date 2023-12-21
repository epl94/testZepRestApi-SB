package com.testZep.testzeprestApisb.controller;

import com.testZep.testzeprestApisb.dto.PlayerDTO;
import com.testZep.testzeprestApisb.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class ApiController {
    private  final PlayerService playerService;

    //     localhost:8080/api/test
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() { // JSON방식으로 String자료형 선택
        return "{\"result\":\"ok\"}";
    }

    @RequestMapping(value = "/api/save", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String save(@ModelAttribute PlayerDTO playerDTO) {
        int saveResult = playerService.save(playerDTO);
        if (saveResult > 0) {
            return "ok";
        } else {
            return "again";
        }
    }

}
