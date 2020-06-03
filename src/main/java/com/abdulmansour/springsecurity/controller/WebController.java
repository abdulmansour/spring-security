package com.abdulmansour.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showLanding() {
        return "landing";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }
}
