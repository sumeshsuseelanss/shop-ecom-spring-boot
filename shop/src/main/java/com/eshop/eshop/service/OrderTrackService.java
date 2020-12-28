package com.eshop.eshop.service;

import com.eshop.eshop.modal.OrderTrack;
import com.eshop.eshop.repository.OrderTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTrackService {

    @Autowired
    OrderTrackRepository orderTrackRepository;

    public OrderTrack orderTrack (OrderTrack orderTrack){

        System.out.println("Order Track ---> "+orderTrack);
        return orderTrackRepository.save(orderTrack);
    }
}
