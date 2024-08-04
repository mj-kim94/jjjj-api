package com.kongkong.jjjjapi.Home;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object test() {
        return true;
    }
}
