package com.eshop.eshop.service;

import com.eshop.eshop.modal.ItemSelected;

import com.eshop.eshop.modal.Login;
import com.eshop.eshop.repository.ArchieveItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArchieveItemService {

    @Autowired
    ArchieveItemRepository archiveItemRepository;

    List<ItemSelected> itemSelectedAll = new ArrayList<>();

    ArchieveItemService(){}

    public ItemSelected addArchieve(ItemSelected itemSelected) {
        System.out.println("archieveItem --->"+ itemSelected.getSelected_item());
        return archiveItemRepository.save(itemSelected);
    }

    public List<ItemSelected> getItemUser(String userName) {
        System.out.println("user name --> "+userName);
        List<ItemSelected> itemForUser = archiveItemRepository.findAll().stream().filter(i -> i.getUser_id().equals(userName)).collect(Collectors.toList());
     //   System.out.println(itemForUser.getUser_id());
        return itemForUser;
    }

    public Long getCountByItems(String item,String user_name){
        Long itemSelCount = archiveItemRepository.countOfItem(item,user_name);
        System.out.println("itemSelCount ---> "+itemSelCount);
       return itemSelCount;
    }

    public Long getCountByUser (String user_name){
        Long itemSelCount = archiveItemRepository.countCartItems(user_name);
        System.out.println("itemSelCount ---> "+itemSelCount);
        return itemSelCount;
    }

    public void deleteItemUserName(String item,String user_name){
        archiveItemRepository.deleteItemByUserName(item,user_name);
    }

    public String getTotalAmount(String userName){
        System.out.println("totalAmount ---");
        String totalAmount = archiveItemRepository.getItemTotal(userName);
        System.out.println("totalAmount ---> "+totalAmount);
        return totalAmount;
    }

    public void updateItemCount(String item , int count , String userName){
           archiveItemRepository.updateItemCount(item,count,userName);
    }

    public void amountUpdate(String item , int amount , String userName){
        archiveItemRepository.updateAmount(item,amount,userName);
    }

}
