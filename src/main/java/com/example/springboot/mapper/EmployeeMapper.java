package com.example.springboot.mapper;


import com.example.springboot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

//加上@Mapper注解或使用@MapperScan将接口扫描到容器中
@Repository
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public void insertEmp(Employee employee);
    List<Employee> getEmps();

    void updateById(Employee employee);

    Employee getEmp(Integer id);

    void deleteById(Integer id);
}
