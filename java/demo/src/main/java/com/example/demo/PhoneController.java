package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneController {

    @Autowired
    private Phone phone;

    @RequestMapping("/phone")
    public String say(){
        return phone.getPhoneName()+phone.getPhoneNum();
     //   return "index";
    }
}