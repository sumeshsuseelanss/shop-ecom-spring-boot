package com.sumesh.ecom.shop.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Login")
public class Login {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generates primary key
    @Id
    private int userId;
//    @OneToOne
//    @PrimaryKeyJoinColumn(name = "userId")
//    RegisterUser Register;

    private String userName;
    private String password;

}
