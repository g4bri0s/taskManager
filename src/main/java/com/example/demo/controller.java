package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class controller {

    // private final service service;

    // @Autowired
    // public controller(service service) {
    // this.service = service;
    // }

    // @GetMapping("/get")
    // public List<client> get() {
    // return service.get();
    // }

    @GetMapping
    public String index() {
        return "index";
    }
}
