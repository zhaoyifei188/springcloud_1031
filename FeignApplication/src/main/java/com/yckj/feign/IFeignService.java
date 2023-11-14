package com.yckj.feign;

import com.yckj.entities.Student;
import com.yckj.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Classname IFeignService
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/11 14:57
 */
@FeignClient(value = "provider",fallback = FeignError.class)// fallback是服务降级，当服务提供者的服务不可用时，会映射执行FeignError
public interface IFeignService {
    @GetMapping("/student/findAll")
    public List<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
