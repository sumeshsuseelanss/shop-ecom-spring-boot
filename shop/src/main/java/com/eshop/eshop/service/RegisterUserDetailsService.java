package com.eshop.eshop.service;

import com.eshop.eshop.modal.RegisterUser;
import com.eshop.eshop.repository.RegisterUserRepository;
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
