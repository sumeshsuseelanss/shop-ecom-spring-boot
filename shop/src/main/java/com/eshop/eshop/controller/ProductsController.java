package com.eshop.eshop.controller;

import com.eshop.eshop.modal.Category;
import com.eshop.eshop.modal.Products;
import com.eshop.eshop.service.CategoryService;
import com.eshop.eshop.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class ProductsController {

    @Autowired
    ProductsService productService;


    @GetMapping("/products")
    public List<Products> get() {
        return productService.getAllProducts();
    }
}
