package com.yckj.controller;

import com.yckj.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname RestTemplateController
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/11 10:46
 */
@RestController
@RequestMapping("/consumer")
public class RestTemplateController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public List findAll(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",List.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Boolean.class);
    }

    @PutMapping("/modify")
    public void modify(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/modify",student);
    }

    @DeleteMapping("/removeById/{id}")
    public void removeById(@PathVariable Long id){
        restTemplate.delete("http://localhost:8010/student/removeById/{id}",id);
    }
}

