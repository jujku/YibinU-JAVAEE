package com.bupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private String hello() {
        return "hello";
    }

}