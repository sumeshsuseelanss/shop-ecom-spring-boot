package com.eshop.eshop.service;

import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.OrderTrack;
import com.eshop.eshop.repository.OrderTrackRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderTrackService {

    @Autowired
    OrderTrackRepository orderTrackRepository;

    public OrderTrack orderTrack (OrderTrack orderTrack){

        System.out.println("Order Track ---> "+orderTrack);
        return orderTrackRepository.save(orderTrack);
    }

    public List<OrderTrack> getOrderByUser(String userName){
        List<OrderTrack> orderHistByUser = orderTrackRepository.findAll().stream().filter(i -> i.getUser_ID().equals(userName)).collect(Collectors.toList());
        return orderHistByUser;
    }
}
