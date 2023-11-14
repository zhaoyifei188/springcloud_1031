package com.yckj.feign.impl;

import com.yckj.entities.Student;
import com.yckj.feign.IFeignService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname FeignError
 * @Description TODO
 * @Copyright:Copyright(c) 2023
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/11/11 15:08
 */
@Component
public class FeignError implements IFeignService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护....";
    }
}
