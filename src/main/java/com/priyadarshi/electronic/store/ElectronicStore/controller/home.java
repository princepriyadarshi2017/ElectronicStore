package com.priyadarshi.electronic.store.ElectronicStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class home {

    @GetMapping
    public String directHome (){

        return "welcome1";
    }
}
