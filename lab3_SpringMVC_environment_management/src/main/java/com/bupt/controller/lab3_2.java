package com.bupt.controller;

import com.bupt.pojo.UserForm;
import com.bupt.pojo.LoginStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class lab3_2 {


    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public Map login(@RequestBody UserForm userForm) {
        System.out.println(userForm.toString());
        if (userForm.getUname().equals("辛禹杉") && userForm.getUpass().equals("210104116")) {
            Map<String, Object> data = new HashMap<>();
            data.put("user",userForm.getUname());
            data.put("upass",userForm.getUpass());
            data.put("loginStatus","1");
            data.put("message","登录成功");
            return data;

        } else {
            Map<String,String> data = new HashMap<>();
            data.put("message","密码或用户名错误");
            return data;
        }

    }
    @RequestMapping(value = "register",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public Map register( UserForm userForm){
        if(userForm.getUname().equals("辛禹杉") && userForm.getUpass().equals("210104116")){
            Map<String,Object> data = new HashMap<>();
            data.put("message","注册成功");
            return data;
        }else{
            Map<String,Object> data = new HashMap<>();
            data.put("message","注册失败");
            return data;
        }
    }
    @RequestMapping(value = "check",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public Map check(@RequestBody LoginStatus loginStatus){
        System.out.println(loginStatus.getLoginstatus());
        if(loginStatus.getLoginstatus().equals("1")){
            Map<String,Object> data = new HashMap<>();
            data.put("message","权限检验成功，你已登录");
            return data;
        }else{
            Map<String,Object> data = new HashMap<>();
            data.put("message","权限检验失败，你未登录");
            return data;
        }
    }

}
