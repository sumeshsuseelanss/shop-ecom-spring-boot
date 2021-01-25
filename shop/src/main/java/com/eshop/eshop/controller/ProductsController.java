package com.eshop.eshop.controller;

import com.eshop.eshop.modal.Category;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.Products;
import com.eshop.eshop.modal.RegisterUser;
import com.eshop.eshop.service.CategoryService;
import com.eshop.eshop.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/products/{category}", method = RequestMethod.GET)
    public List<Products> getFilteredCategory(@PathVariable("category") String category){
        return productService.getFilteredCategory(category);
    }

    @PostMapping("/postProduct")
    public Products postProduct(@RequestBody Products product){
        return productService.postProduct(product);
    }


    @RequestMapping(value = "/product/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") int id) {
        System.out.println("delete id from product ----> "+id);
        productService.deleteItemUserNameById(id);
    }

    @PutMapping("/updateProduct/{id}/{productName}")
    public void updateProduct(@RequestBody Products product,@PathVariable int id, @PathVariable String productName) {
         productService.putProductName(id,productName);

    }

}
