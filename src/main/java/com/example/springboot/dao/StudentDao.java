package com.example.springboot.dao;

import com.example.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Student getStudent(Integer id) {
       /* List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from student");*/
        Student student;
        try {
            student = jdbcTemplate.queryForObject("select * from student where id=" + id, Student.class);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
        return student;
    }
}
