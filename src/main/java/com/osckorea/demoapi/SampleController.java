package com.osckorea.demoapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SampleController {
    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
