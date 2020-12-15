package com.eshop.eshop.service;

import com.eshop.eshop.modal.ItemSelected;

import com.eshop.eshop.repository.ArchieveItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ArchieveItemService {

    @Autowired
    ArchieveItemRepository archiveItemRepository;

    List<ItemSelected> itemSelectedAll = new ArrayList<>();

    ArchieveItemService(){}

    public ItemSelected addArchieve(ItemSelected itemSelected) {
        System.out.println("archieveItem --->"+ itemSelected);
        return archiveItemRepository.save(itemSelected);
    }

}
