package com.tutorial.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/api/hello/{resourceId}")
    public String getString(@PathVariable String resourceId) {
        return "Here is the resourceId: " + resourceId;
    }
    
}

class Profile {

    private String name;
    private String email;
}
