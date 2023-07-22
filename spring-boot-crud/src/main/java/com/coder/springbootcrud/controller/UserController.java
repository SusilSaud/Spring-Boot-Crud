package com.coder.springbootcrud.controller;

import com.coder.springbootcrud.entities.User;
import com.coder.springbootcrud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")


public class UserController {

    //dependency injection search

    @Autowired  //dependency injection -> we don't need to make UserService =  new UserService as autowired does at runtime automatically

    UserService userService;
    @GetMapping("")
    public User getUser(@RequestParam("id") int id){//RequestParam -> postman bata id get garnalai.@RequestParam is an annotation in the Spring Framework used for accessing and binding request parameters in web applications
        return userService.getUser(id);
    }
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUSer();
    }

    @PostMapping("")
    public String addUser(@RequestBody User user){// RequestBody.@RequestBody is an annotation in the Spring Framework used to bind the content of an HTTP request body to a method parameter in a Spring controller.
        return userService.addUser(user);
    }

    @PutMapping("")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("")
    public String deleteUser(@RequestParam("id") int id){
        return userService.deleteUser(id);
    }



}
