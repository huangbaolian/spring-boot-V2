package com.example.springboot.service.impl;



import com.example.springboot.entity.Employee;
import com.example.springboot.mapper.EmployeeMapper;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmps() {
        List<Employee> emps = employeeMapper.getEmps();
        return emps;
    }

    @Override
    public void insertEmp(Employee employee) {
        employeeMapper.insertEmp(employee);
    }

    @Override
    public void updateEmp(Employee employee) {
        employeeMapper.updateById(employee);
    }

    @Override
    public Employee getEmp(Integer id) {
        return employeeMapper.getEmp(id);
    }

    @Override
    public void deleteById(Integer id) {
        employeeMapper.deleteById(id);
    }
}
