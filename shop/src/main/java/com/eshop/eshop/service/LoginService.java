package com.eshop.eshop.service;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import com.eshop.eshop.modal.Login;
import com.eshop.eshop.modal.RegisterUser;
import com.eshop.eshop.repository.LoginRepository;
import com.eshop.eshop.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eshop.eshop.dto.OrderResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    List<Login> loginAll = new ArrayList<>();


    LoginService() {
//        Login login = new Login(3,"Sumesh","sumesh");
//        Login login1 = new Login(4,"admin","admin");
//        Login login2 = new Login(5,"thendral","thendral");
//        Login login3 = new Login(6,"achu","achu");
//        loginAll.add(login);
//        loginAll.add(login1);
//        loginAll.add(login2);
//        loginAll.add(login3);


    }

    public Login loginUserPost(Login loginUser) {
        return loginRepository.save(loginUser);
    }

    public List<Login> getAllLoginDetails() {
        return loginRepository.findAll();
    }



    public Login getByUserName(String userName) {
        System.out.println("user name --> "+userName);
        Login login = loginRepository.findAll().stream().filter(i -> i.getUserName().equals(userName)).collect(Collectors.toList()).get(0);
        System.out.println(login.getUserName());
        return login;
    }
}
