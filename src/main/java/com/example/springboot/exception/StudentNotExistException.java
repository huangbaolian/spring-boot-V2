package com.example.springboot.exception;

public class StudentNotExistException extends RuntimeException{
    public StudentNotExistException() {
        super("查询的学生不存在");
    }
}
