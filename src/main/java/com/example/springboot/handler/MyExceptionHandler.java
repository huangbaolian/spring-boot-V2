package com.example.springboot.handler;

import com.example.springboot.exception.StudentNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    //浏览器,客户端都返回json
    @ResponseBody
    @ExceptionHandler(StudentNotExistException.class)
    public Map<String, Object> HandleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user not exist");
        map.put("message",e.getMessage());
        return map;
    }
}
