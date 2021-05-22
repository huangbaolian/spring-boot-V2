package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Api(tags={"User增删改查-基于JPA"})
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable("id") Integer id){
       Optional<User> user = userService.getUser(id);
        return user;
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public User insertUser(User user){
        userService.inserUser(user);
        return user;
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User updateUser(User user){
        userService.updateUser(user);
        return user;
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "delete a user";
    }
}
