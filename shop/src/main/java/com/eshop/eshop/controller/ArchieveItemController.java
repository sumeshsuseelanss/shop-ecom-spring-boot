package com.eshop.eshop.controller;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.service.ArchieveItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class ArchieveItemController {
    @Autowired
    ArchieveItemService archieveItemService;


    @PostMapping("/archieveItem")
    public ItemSelected archieveItem(@RequestBody ItemSelected Archieve){
        System.out.println("Archieve from main- >"+Archieve);
       return archieveItemService.addArchieve(Archieve);
   }

}
