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

    @RequestMapping(value="/itemsCount/{item}/{user_name}", method = RequestMethod.GET)
    public @ResponseBody Long getCountByItems(@PathVariable("item") String item,@PathVariable("user_name") String user_name){
        return archieveItemService.getCountByItems(item,user_name);
    }

    @RequestMapping(value="/items/{username}", method = RequestMethod.GET)
    public List<ItemSelected> getUserBasedItems(@PathVariable("username") String username){
        return archieveItemService.getItemUser(username);
    }

    @RequestMapping(value = "/delete/{item}/{user_name}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("item") String item,@PathVariable("user_name") String user_name) {
        archieveItemService.deleteItemUserName(item, user_name);
    }

    @RequestMapping(value="/items/total/{user_name}", method = RequestMethod.GET)
    public int getTotalAmount(@PathVariable("user_name") String user_name){
        return archieveItemService.getTotalAmount(user_name);
    }

}
