package com.yckj.controller;

import com.yckj.entities.Student;
import com.yckj.feign.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname FeignController
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/11 15:01
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private IFeignService feignService;
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return feignService.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignService.index();
    }
}
