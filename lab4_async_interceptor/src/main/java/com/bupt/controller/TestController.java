package com.bupt.controller;

import com.bupt.pojo.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/testJson")
public class TestController {

    @RequestMapping(value = "login",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @CrossOrigin(origins = "*")
    public List<Map<String,Object>> testJson(@RequestBody Person user){
        System.out.println("Pname=" + user.getPname() + ",password=" +
                user.getPassword() + ",page=" + user.getPage());

//        ArrayList<Person> allp = new ArrayList<Person>();
//
//        Person p1 = new Person();
//        p1.setPname("瑞峰1");
//        p1.setPassword("123456");
//        p1.setPage(18);
//        allp.add(p1);
//
//        Person p2 = new Person();
//        p2.setPname("金武");
//        p2.setPassword("12345");
//        p2.setPage(16);
//        allp.add(p2);
//
//        return allp;
        Map<String,Object> map = new HashMap<String,Object>(){};
        map.put("pname","瑞峰1");
        map.put("password","123456");
        map.put("page","17");

        List<Map<String,Object>> allp = new ArrayList<Map<String,Object>>();
        allp.add(map);

        Map<String,Object> map1 = new HashMap<String,Object>(){};
        map1.put("pname","金武");
        map1.put("password","12345");
        map1.put("page","19");
        allp.add(map1);

        return allp;
    }
}
