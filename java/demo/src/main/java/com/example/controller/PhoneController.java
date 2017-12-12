package com.example.controller;

import com.example.demo.Phone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    @RequestMapping("/phone")
    public String say(){
        Phone phone  = new Phone();
        phone.setPhoneName("phoneName==lsl");
        phone.setPhoneNum("phoneNum==188688");
        return phone.getPhoneName()+","+phone.getPhoneNum();
    }
}