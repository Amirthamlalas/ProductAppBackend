package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
        public String HomePage(){
        return "WELCOME TO PRODUCTAPP";
    }
}
