package com.millenniuitesp.ott.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/fallback")
    public String fallback() {
        return "fallback";
    }
}
