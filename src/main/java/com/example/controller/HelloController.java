package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/")
    public String helloPage() {

        return "hello";
    }

    @PostMapping("/save")
    public String sayHello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
