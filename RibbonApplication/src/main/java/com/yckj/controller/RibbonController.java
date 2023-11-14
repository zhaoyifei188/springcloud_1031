package com.yckj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List findAll(){
        return restTemplate.getForObject("http://provider/student/findAll", List.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }

}
