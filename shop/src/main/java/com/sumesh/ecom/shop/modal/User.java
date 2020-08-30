package com.sumesh.ecom.shop.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;

    @OneToMany(targetEntity = Products.class,cascade = CascadeType.ALL )
    @JoinColumn(name="cp_fk",referencedColumnName = "id")
    private List<Products> products;
}
