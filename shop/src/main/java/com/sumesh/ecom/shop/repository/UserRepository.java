package com.sumesh.ecom.shop.repository;

import com.sumesh.ecom.shop.dto.OrderResponse;
import com.sumesh.ecom.shop.modal.RegisterUser;
import com.sumesh.ecom.shop.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT new com.sumesh.ecom.shop.dto.OrderResponse(u.username , p.productName) FROM User" +
            " u Join u.products p")
    List<OrderResponse> getUserNameAndProduct();
}
