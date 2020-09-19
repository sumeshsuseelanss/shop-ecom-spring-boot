package com.eshop.eshop.repository;

import com.eshop.eshop.dto.OrderResponse;
import com.eshop.eshop.modal.RegisterUser;
import com.eshop.eshop.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT new com.eshop.eshop.dto.OrderResponse(u.username , p.productName) FROM User" +
            " u Join u.products p")
    List<OrderResponse> getUserNameAndProduct();
}
