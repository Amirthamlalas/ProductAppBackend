package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
        public String HomePage(){
        return "WELCOME TO PRODUCTAPP";
    }
    @PostMapping("/search")
    public String searchProduct(){
        return "This is search page";
    }
    @PostMapping("/edit")
    public String editProduct(){
        return "This is edit page";
    }

    @PostMapping("/delete")
    public String deleteProduct(){
        return "This is delete page";
    }
}
