package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping(
)
public class HelloWorldControl {
    @GetMapping("/hello")

    public String getRequestFunction(){
        return "hello world";
    }

//@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
//public String hello(Model model){
//    model.addAttribute("name","ahmad");
//    return "Capitalize.html";
//}
    @RequestMapping(value = "/Capitalize", method = RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("name","ahmad"); // can be used to add values in pairs form, and they can be used in the template
        return "Capitalize";       // because it is a controller annotation, it will expect a name of template returned
    }
}
