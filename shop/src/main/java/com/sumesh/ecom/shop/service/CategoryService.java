package com.sumesh.ecom.shop.service;

import com.sumesh.ecom.shop.modal.Category;
import com.sumesh.ecom.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    List<Category> catAll = new ArrayList<>();

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
