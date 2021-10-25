package com.example.songr.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class root {
    @GetMapping("/")
    public String getFromRoot (){

        return "root";
    }
}
