package com.eshop.eshop.repository;

import com.eshop.eshop.modal.ItemSelected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArchieveItemRepository extends JpaRepository<ItemSelected, Integer> {

    @Query("SELECT COUNT(u) FROM ItemSelected u WHERE u.selected_item=?1")
    Long countOfItem(String selected_item);


}
