package com.bupt.controller;

import com.bupt.Service.TestService;
import com.bupt.enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("hello")
    public String test(){
        return "Hello";
    }

    @PostMapping("/addUser")
    public void test(@RequestBody User user){
        testService.addUser(user);
    }
    @PostMapping("/deleteUser")
    public void testDelete(@RequestBody int id){
        testService.deleteUser(id);
    }
    @PostMapping("/updateUser")
    public void testUpdate(@RequestBody User user){
        testService.updateUser(user);
    }
    @PostMapping("/getUser")
    public User testGet(@RequestBody int id){
        User user = testService.getUserById(id);
        return user;
    }

}
