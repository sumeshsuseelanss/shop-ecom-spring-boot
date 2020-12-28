package com.eshop.eshop.controller;
import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.Login;
import com.eshop.eshop.modal.RegisterUser;
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

    @RequestMapping(value="/itemsCount/{user_name}", method = RequestMethod.GET)
    public @ResponseBody Long getCartCount(@PathVariable("user_name") String user_name){
        return archieveItemService.getCountByUser(user_name);
    }

    @RequestMapping(value="/items/{username}", method = RequestMethod.GET)
    public List<ItemSelected> getUserBasedItems(@PathVariable("username") String username){
        return archieveItemService.getItemUser(username);
    }

    @RequestMapping(value = "/delete/{item}/{user_name}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("item") String item,@PathVariable("user_name") String user_name) {
        archieveItemService.deleteItemUserName(item, user_name);
    }

    @RequestMapping(value = "/delete/{user_name}", method = RequestMethod.DELETE)
    public void emptyCart(@PathVariable("user_name") String user_name) {
        archieveItemService.emptyCart(user_name);
    }

    @RequestMapping(value="/items/total/{user_name}", method = RequestMethod.GET)
    public String getTotalAmount(@PathVariable("user_name") String user_name){
        return archieveItemService.getTotalAmount(user_name);
    }

    @PutMapping(value="/items/update/{item}/{itemCount}/{user_name}")
    public void updateCount(@RequestBody ItemSelected Archieve,@PathVariable("item") String item ,@PathVariable("itemCount")  int itemCount,
                            @PathVariable("user_name") String user_name){
         archieveItemService.updateItemCount(item,itemCount,user_name);
    }

    @PutMapping(value="/item/amountupdate/{item}/{itemAmount}/{user_name}")
    public void amountUpdate(@RequestBody ItemSelected Archieve,@PathVariable("item") String item ,@PathVariable("itemAmount")  int itemAmount,
                            @PathVariable("user_name") String user_name){
        archieveItemService.amountUpdate(item,itemAmount,user_name);
    }


}
