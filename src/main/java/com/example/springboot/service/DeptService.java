package com.example.springboot.service;

import com.example.springboot.entity.Department;

public interface DeptService {
    Department getDeptByid(Integer id);

    void insertDept(Department department);

    int deleteDeptById(Integer id);

    void updateDept(Department department);
}
