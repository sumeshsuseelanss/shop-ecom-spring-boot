package com.eshop.eshop.service;

import com.eshop.eshop.modal.Address;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.repository.AddressRepository;
import com.eshop.eshop.repository.ArchieveItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;


    public Address postAddress(Address add) {
        System.out.println("add --->"+ add);
        return addressRepository.save(add);
    }
}
