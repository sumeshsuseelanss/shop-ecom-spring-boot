package com.eshop.eshop.repository;

import com.eshop.eshop.modal.Products;
import com.eshop.eshop.modal.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
