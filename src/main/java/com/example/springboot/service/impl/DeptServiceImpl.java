package com.example.springboot.service.impl;

import com.example.springboot.entity.Department;
import com.example.springboot.mapper.DepartmentMapper;
import com.example.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public Department getDeptByid(Integer id) {
        return departmentMapper.getDeptByid(id);
    }

    @Override
    public void insertDept(Department department) {
        departmentMapper.insertDept(department);
    }

    @Override
    public int deleteDeptById(Integer id) {
        return departmentMapper.deleteDeptById(id);
    }

    @Override
    public void updateDept(Department department) {
        departmentMapper.updateDept(department);
    }
}
