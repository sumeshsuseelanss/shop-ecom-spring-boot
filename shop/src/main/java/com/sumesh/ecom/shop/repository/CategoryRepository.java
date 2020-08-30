package com.sumesh.ecom.shop.repository;

import com.sumesh.ecom.shop.modal.Category;
import com.sumesh.ecom.shop.modal.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
