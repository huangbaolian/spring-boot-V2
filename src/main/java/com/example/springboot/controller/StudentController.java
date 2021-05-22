package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(tags={"Student增删改查-基于JDBCTemplate-exception"})
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @ApiOperation(value = "查询一个student")
    @ResponseBody
    @GetMapping("/queryStudent/{id}")
    public Student getStudent(Integer id){
       Student student =  studentService.getStudent(id);
        return student;
    }
}
