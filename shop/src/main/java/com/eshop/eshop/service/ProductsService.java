package com.eshop.eshop.service;

import com.eshop.eshop.modal.Category;
import com.eshop.eshop.modal.Products;
import com.eshop.eshop.repository.CategoryRepository;
import com.eshop.eshop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    List<Products> productAll = new ArrayList<>();

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public List<Products> getFilteredCategory(String category){
        return productsRepository.filterByCategory(category);
    }

    public Products postProduct(Products products){
        return productsRepository.save(products);
    }



    public void deleteItemUserNameById(int id){
        System.out.println("delete id ---> "+id);
        productsRepository.deleteById(id);

    }


    public void putProductName(int pID,String productName){
       productsRepository.updateProduct(pID,productName);
    }


}
