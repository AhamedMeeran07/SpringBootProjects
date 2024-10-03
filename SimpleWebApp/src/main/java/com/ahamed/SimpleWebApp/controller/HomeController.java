package com.ahamed.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet() {
        return "Welcome to Ahamed";

    }

    @RequestMapping("/about")

    public String about(){
        return "I am a Full stack java developer and I teach people to learn this";
    }
}
