package com.learning.ontheway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {

    @GetMapping("/request")
    public String request(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name", name);
        return "greet";
    }
}
