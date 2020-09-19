package com.eshop.eshop.modal;

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
    @OneToOne
    @PrimaryKeyJoinColumn(name = "userId")
    RegisterUser Register;
    private String userName;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public RegisterUser getRegister() {
        return Register;
    }

    public void setRegister(RegisterUser register) {
        Register = register;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
