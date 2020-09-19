package com.eshop.eshop.controller;

import com.eshop.eshop.dto.OrderRequest;
import com.eshop.eshop.dto.OrderResponse;
import com.eshop.eshop.modal.User;
import com.eshop.eshop.repository.ProductsRepository;
import com.eshop.eshop.repository.UserRepository;
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
    public User placeOrder(@RequestBody User request){
        System.out.println("Test --- >"+request);
        return userRepository.save(request);
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
