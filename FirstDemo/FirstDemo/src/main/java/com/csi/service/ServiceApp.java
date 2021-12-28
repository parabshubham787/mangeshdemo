package com.csi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ServiceApp {
    @GetMapping()
    public String SayHello()
    {
        return "welcome";
    }
    @GetMapping("/address")
    public String SayAddress()
    {
        return "pune";
    }
    @GetMapping("/service")
    public String SayService()
    {
        return "job";
    }
    @GetMapping("/job")
    public String Sayjob()
    {
        return "java";
    }
}
