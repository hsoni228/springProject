package com.himanshu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping("getData")
    public String getData(){
        return "success";
    }

}
