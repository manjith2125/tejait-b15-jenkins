package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("welcome")
    public String welocme(){
        return "Welcome to Jenkins user Manjith";
    }
    // added comment for maven to test weather it is updating in every minute in Jenkins

@GetMapping("hello")
    public String hello(){

        return  "Hello manjith.i am jenkins how can i help you";
    }
}
