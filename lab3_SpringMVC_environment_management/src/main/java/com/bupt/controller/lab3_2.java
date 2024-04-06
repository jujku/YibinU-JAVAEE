package com.bupt.controller;

import com.bupt.pojo.UserForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class lab3_2 {

    @RequestMapping(value = "login",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public Map login(@RequestBody UserForm userForm) {
        if (userForm.getUname().equals("辛禹杉") && userForm.getUpass().equals("123456")) {
            Map<String, Object> data = new HashMap<>();
            data.put("user","辛禹杉");
            data.put("loginStatus","1");
            return data;

        } else {
            Map<String,String> data = new HashMap<>();
            data.put("message","密码或用户名错误");
            return data;
        }

    }
    @RequestMapping(value = "register",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public Map register(@RequestBody UserForm userForm){
        if(userForm.getUname().equals())
    }
}
