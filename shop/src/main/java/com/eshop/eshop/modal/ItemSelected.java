package com.eshop.eshop.modal;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ItemSelected")
public class ItemSelected {
  @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically generates primary key
   @Id
   private int selected_item_id;
   @Column(unique = true,name = "selected_item")
   private String selected_item;
   private int item_count;
   private int item_price;
   private String item_image;
   private String user_id;

    public int getSelected_item_id() {
        return selected_item_id;
    }

    public void setSelected_item_id(int selected_item_id) {
        this.selected_item_id = selected_item_id;
    }

    public String getSelected_item() {
        return selected_item;
    }

    public void setSelected_item(String selected_item) {
        this.selected_item = selected_item;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }
}
