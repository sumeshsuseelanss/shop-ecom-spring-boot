package com.sumesh.ecom.shop.controller;

import com.sumesh.ecom.shop.modal.Category;
import com.sumesh.ecom.shop.modal.Products;
import com.sumesh.ecom.shop.service.CategoryService;
import com.sumesh.ecom.shop.service.ProductsService;
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
