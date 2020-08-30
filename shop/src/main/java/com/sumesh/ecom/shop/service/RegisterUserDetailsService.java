package com.sumesh.ecom.shop.service;

import com.sumesh.ecom.shop.modal.RegisterUser;
import com.sumesh.ecom.shop.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RegisterUserDetailsService {
    @Autowired
    RegisterUserRepository registerUserRepository;

    List<RegisterUser> RegisterUserAll = new ArrayList<>();


    RegisterUserDetailsService() {
//        RegisterUser registerUser = new RegisterUser(12,"","",23,"");
//        RegisterUserAll.add(registerUser);
    }

    public RegisterUser registerUserPost(RegisterUser registerUser) {
        return registerUserRepository.save(registerUser);
    }
}
