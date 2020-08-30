package com.sumesh.ecom.shop.controller;

import com.sumesh.ecom.shop.dto.OrderRequest;
import com.sumesh.ecom.shop.dto.OrderResponse;
import com.sumesh.ecom.shop.modal.User;
import com.sumesh.ecom.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/placeorder")
    public User placeOrder(@RequestBody OrderRequest request){
        System.out.println("Test ==> "+request.getUser());
        return userRepository.save(request.getUser());
    }


    @GetMapping("/findAllOrders")
    public List<User> findAllOrders(){
        return userRepository.findAll();
    }

    @GetMapping("/getUserProduct")
    public List<OrderResponse> getUserNameAndProduct(){
        return userRepository.getUserNameAndProduct();
    }
}
