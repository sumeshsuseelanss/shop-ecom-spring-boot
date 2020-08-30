package com.sumesh.ecom.shop.controller;

import com.sumesh.ecom.shop.modal.Category;
import com.sumesh.ecom.shop.modal.Login;
import com.sumesh.ecom.shop.service.CategoryService;
import com.sumesh.ecom.shop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController

public class CategoryController {


    @Autowired
    CategoryService categoryService;


    @GetMapping("/categories")
    public List<Category> get() {
        return categoryService.getAllCategory();
    }

}
