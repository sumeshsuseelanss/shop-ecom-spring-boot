package com.eshop.eshop.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Register")
public class RegisterUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generates primary key
    @Id
    private int userId;
    private String fullName;
    private String userName;
    private int mobileNumber;
    private String password;


    @OneToOne(mappedBy = "Register")
    Login login;


}
