package com.cavapy.front.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
