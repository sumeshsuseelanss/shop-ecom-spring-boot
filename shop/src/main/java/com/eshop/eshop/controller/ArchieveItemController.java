package com.eshop.eshop.controller;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.Login;
import com.eshop.eshop.service.ArchieveItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @RequestMapping(value="/itemsCount/{item}", method = RequestMethod.GET)
    public @ResponseBody Long getCountByItems(@PathVariable("item") String item){
        return archieveItemService.getCountByItems(item);
    }

    @RequestMapping(value="/items/{username}", method = RequestMethod.GET)
    public List<ItemSelected> getUserBasedItems(@PathVariable("username") String username){
        return archieveItemService.getItemUser(username);
    }

}
