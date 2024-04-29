package com.example.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/fleet.html")
    public String fleet() {
        return "fleet";
    }

    @GetMapping("/book.html")
    public String book() {
        return "book";
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }
    @GetMapping("/index.html")
    public String index() {
        return "index";
    }
}
