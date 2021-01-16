package com.eshop.eshop.service;

import com.eshop.eshop.modal.Category;
import com.eshop.eshop.repository.CategoryRepository;
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
