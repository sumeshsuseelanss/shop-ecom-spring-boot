package com.eshop.eshop.controller;

import com.eshop.eshop.modal.Category;
//import com.eshop.eshop.modal.Login;
import com.eshop.eshop.service.CategoryService;
//import com.eshop.eshop.service.LoginService;
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
