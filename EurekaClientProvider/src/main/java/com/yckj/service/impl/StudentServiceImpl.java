package com.yckj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yckj.entities.Student;
import com.yckj.mapper.StudentMapper;
import com.yckj.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}