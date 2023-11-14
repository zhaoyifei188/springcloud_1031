package com.yckj.feign;

import com.yckj.entities.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider")
public interface FeignProviderClient {
   @GetMapping("/student/findAll")
   public List<Student> findAll();
   @GetMapping("/student/index")
   public String index();
}
