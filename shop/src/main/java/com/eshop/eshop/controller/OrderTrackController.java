package com.eshop.eshop.controller;


import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.OrderTrack;
import com.eshop.eshop.service.OrderTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class OrderTrackController {
    @Autowired
    OrderTrackService orderTrackService;

    @PostMapping("/order/trackOrder")
    public OrderTrack TrackOrder(@RequestBody OrderTrack orderTrack){
        System.out.println("orderTrack from controller "+orderTrack);
        return orderTrackService.orderTrack(orderTrack);
    }
}
