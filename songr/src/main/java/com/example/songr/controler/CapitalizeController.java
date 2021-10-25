package com.example.songr.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {
    @GetMapping("/capitalize/{words}")
    public String getFromHtml(Model model, @PathVariable String words) {
        String lastString = words.toUpperCase();
        model.addAttribute("words", lastString);
        return "Capitalize";
    }
}