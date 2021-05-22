package com.example.springboot.controller;


import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags={"employee增删改查-基于mybatis的配置文件"})
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //查询所有员工列表页面
    @GetMapping("/emps")
    public List<Employee> getEmps(){
        List<Employee> emps = employeeService.getEmps();
        return emps;
    }
    //根据员工id查询某个员工信息
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable(value = "id") Integer id){
        Employee employee = employeeService.getEmp(id);
        return employee;
    }
    //插入一个员工信息
    @PutMapping("/empInsert")
    public Employee inserEmp(Employee employee){
        System.out.println(employee);
        employeeService.insertEmp(employee);
        return employee;
    }
    //根据id更新员工信息
    @PostMapping("/empUpdate")
    public String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        return "update success";
    }
    //根据id删除一个员工
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable(value = "id") Integer id){
        employeeService.deleteById(id);
        return "delete success";
    }



}
