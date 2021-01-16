package com.eshop.eshop.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Category")
public class Category {
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generates primary key
    @Id
    private int catID;
    private String category;
}
