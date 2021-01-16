package com.eshop.eshop.controller;

import com.eshop.eshop.modal.Address;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.Products;
import com.eshop.eshop.service.AddressService;
import com.eshop.eshop.service.ArchieveItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping("/address")
    public Address archieveItem(@RequestBody Address add){
        System.out.println("add from main- >"+add);
        return addressService.postAddress(add);
    }

    @RequestMapping(value="/address/{userName}", method = RequestMethod.GET)
    public List<Address> getFilteredCategory(@PathVariable("userName") String userName){
        return addressService.usergetAddressDetails(userName);
    }
}
