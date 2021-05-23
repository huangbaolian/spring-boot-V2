package com.example.springboot.controller;

import com.example.springboot.entity.Department;
import com.example.springboot.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags={"department增删改查-基于mybatis的注解"})
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @ApiOperation(value = "查询一个department")
    @GetMapping("/getDept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return deptService.getDeptByid(id);
    }
    @ApiOperation(value = "插入一个department")
    @GetMapping("/deptInsert")
    public Department insertDepartment(Department department){
        System.out.println("+++++++"+department.getId());
        deptService.insertDept(department);
        return department;
    }
    @ApiOperation(value = "删除一个department")
    @GetMapping("/deptDelete/{id}")
    public String deleteDepartment(@PathVariable("id") Integer id){
        int i = deptService.deleteDeptById(id);
        return "success to delete";
    }
    @ApiOperation(value = "更新一个department")
    @GetMapping("/deptUpdate")
    public Department updateDepartment(Department department){
        deptService.updateDept(department);
        return department;
    }

}
