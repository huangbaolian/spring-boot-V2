package com.example.springboot.service.impl;

import com.example.springboot.dao.StudentDao;
import com.example.springboot.entity.Student;
import com.example.springboot.exception.StudentNotExistException;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    //
    @Override
    public Student getStudent(Integer id) {
        Student student = studentDao.getStudent(id);
        if (student==null){
            throw new StudentNotExistException();
        }
        return student;
    }
}
