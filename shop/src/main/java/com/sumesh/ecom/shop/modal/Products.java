package com.sumesh.ecom.shop.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Products")
public class Products {

    @Id
    private int prodID;
    private String productName;
    private String Image;
    private String price;
    private String descriptions;
    private String Category;


}
