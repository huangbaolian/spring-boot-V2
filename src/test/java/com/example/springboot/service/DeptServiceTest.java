package com.example.springboot.service;

import com.example.springboot.entity.Department;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class DeptServiceTest {
    @Autowired
    DeptService deptService;
    @Test
    void getDeptByid() {
        Department deptByid = deptService.getDeptByid(1);
        Assert.assertEquals(deptByid.getDepartmentName(),"111");
    }

    @Test
    @Transactional//单元个测试的时候如果不想造成垃圾数据，可以开启事物功能，记在方法或者类头部添加@Transactional注解即可
    void insertDept() {
        Department department = new Department();
        department.setDepartmentName("haha");
        deptService.insertDept(department);
    }

    @Test
    @Transactional
    void deleteDeptById() {
        int i = deptService.deleteDeptById(1);
        assertEquals(1,1);
    }

    @Test
    void updateDept() {
        Department department = new Department();
        department.setId(1);
        department.setDepartmentName("haha");
        deptService.updateDept(department);
    }
}