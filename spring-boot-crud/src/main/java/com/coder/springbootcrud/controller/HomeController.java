package com.coder.springbootcrud.controller;

import com.coder.springbootcrud.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")


public class HomeController {

//    @GetMapping("")
//    public String getHome(){
//        return "This is get method";
//    }


    @GetMapping("")
    public User getHome(){
        User user = new User(1,"susil",23);
        return user;
    }



    // post
    @PostMapping("")
    public String postHome(){
        return  " This is a post method";

    }

    @PutMapping("")
    public String putHome(){
        return "This is a put method";
    }

    @DeleteMapping("")
    public String deleteHome(){
        return "This is delete method";

    }
}
