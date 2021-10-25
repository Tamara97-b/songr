package com.example.songr.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class HelloWorldControl {
    @GetMapping("/hello")

    public String getRequestFunction(){
        return "hello world";
    }


}
