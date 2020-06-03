package com.abdulmansour.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/showLoginPage")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/authenticateUser")
    public String authenticateUser() {
        return null;
    }
}
