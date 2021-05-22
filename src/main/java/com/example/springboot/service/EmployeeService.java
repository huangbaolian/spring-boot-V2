package com.example.springboot.service;





import com.example.springboot.entity.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getEmps();

    void insertEmp(Employee employee);

    void updateEmp(Employee employee);

    Employee getEmp(Integer id);

    void deleteById(Integer id);
}
