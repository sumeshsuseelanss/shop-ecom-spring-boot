package com.eshop.eshop.repository;

import com.eshop.eshop.modal.ItemSelected;
import com.eshop.eshop.modal.OrderTrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTrackRepository extends JpaRepository<OrderTrack, Integer> {
}
