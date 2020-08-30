package com.sumesh.ecom.shop.controller;

import com.sumesh.ecom.shop.modal.Login;
import com.sumesh.ecom.shop.modal.RegisterUser;
import com.sumesh.ecom.shop.service.LoginService;
import com.sumesh.ecom.shop.service.RegisterUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class RegisterUserController {

    @Autowired
    RegisterUserDetailsService registerUserDetailsService;

    @PostMapping("/registerUser")
    public RegisterUser registerUser(@RequestBody RegisterUser register){
        return registerUserDetailsService.registerUserPost(register);
    }
}
