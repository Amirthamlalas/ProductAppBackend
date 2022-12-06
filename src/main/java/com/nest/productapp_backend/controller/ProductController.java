package com.nest.productapp_backend.controller;

import com.nest.productapp_backend.dao.ProductDao;
import com.nest.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;

    @GetMapping("/")
        public String HomePage(){
        return "WELCOME TO PRODUCTAPP";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Products p){
        System.out.println(p.getProductName().toString());
        System.out.println(p.getPrice());
        dao.save(p);
        return "Succesfully added product";
    }
    @PostMapping("/search")
    public String searchProduct(){
        return "This is search page";
    }
    @PostMapping("/edit")
    public String editProduct(){
        return "This is edit page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
   public List<Products>view(){
        return (List<Products>) dao.findAll();
    }

    @PostMapping("/delete")
    public String deleteProduct(){
        return "This is delete page";
    }
}
