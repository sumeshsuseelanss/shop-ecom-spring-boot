package com.sumesh.ecom.shop.repository;

import com.sumesh.ecom.shop.modal.Products;
import com.sumesh.ecom.shop.modal.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
