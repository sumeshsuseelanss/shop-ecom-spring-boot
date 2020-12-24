package com.eshop.eshop.repository;

import com.eshop.eshop.modal.ItemSelected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ArchieveItemRepository extends JpaRepository<ItemSelected, Integer> {

    @Query("SELECT COUNT(u) FROM ItemSelected u WHERE u.selected_item=?1 and u.user_id=?2")
    Long countOfItem(String selected_item,String user_name);

    @Modifying
    @Transactional
    @Query("DELETE FROM ItemSelected u WHERE u.selected_item=?1 and u.user_id=?2")
    void deleteItemByUserName(String selected_item,String user_name);


    @Query("select sum(u.item_price) from ItemSelected u WHERE u.user_id=?1")
    String getItemTotal(String userName);

    @Transactional
    @Modifying
    @Query("update ItemSelected u set u.item_count =?2 where u.selected_item =?1 and user_id =?3")
    void updateItemCount(String item,int count, String userName);

    @Transactional
    @Modifying
    @Query("update ItemSelected u set u.item_price =?2 where u.selected_item =?1 and user_id =?3")
    void updateAmount(String item,int amount, String userName);



}
