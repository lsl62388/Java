package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "phone")
public class Phone {
    public String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String phoneNum;

}
