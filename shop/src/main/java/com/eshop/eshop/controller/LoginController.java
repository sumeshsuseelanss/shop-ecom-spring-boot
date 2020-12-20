package com.eshop.eshop.controller;

import com.eshop.eshop.modal.Login;
import com.eshop.eshop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController

public class LoginController {
        @Autowired
        LoginService loginService;

        @PostMapping("/postUser")
        public Login loginUser(@RequestBody Login login){
                return loginService.loginUserPost(login);
        }

        @RequestMapping(value="/user/{username}", method = RequestMethod.GET)
        public @ResponseBody Login getByUserName(@PathVariable("username") String username){
                return loginService.getByUserName(username);
        }


        @GetMapping("/users")
        public List<Login> getProductDetails(){
                return loginService.getAllLoginDetails();
        }
}
