package com.eshop.eshop.repository;

import com.eshop.eshop.modal.Address;
import com.eshop.eshop.modal.ItemSelected;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
