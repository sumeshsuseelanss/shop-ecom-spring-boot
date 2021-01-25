package com.eshop.eshop.repository;

import com.eshop.eshop.modal.Products;
import com.eshop.eshop.modal.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

    @Query("SELECT u FROM Products u WHERE u.Category=?1")
    List filterByCategory(String category);

    @Transactional
    @Modifying
    @Query("update Products u set u.productName =?2 where u.prodID =?1")
    void updateProduct(int prodID,String productName);
}
