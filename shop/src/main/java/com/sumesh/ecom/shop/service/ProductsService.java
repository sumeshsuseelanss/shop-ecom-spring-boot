package com.sumesh.ecom.shop.service;

import com.sumesh.ecom.shop.modal.Category;
import com.sumesh.ecom.shop.modal.Products;
import com.sumesh.ecom.shop.repository.CategoryRepository;
import com.sumesh.ecom.shop.repository.ProductsRepository;
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
}
