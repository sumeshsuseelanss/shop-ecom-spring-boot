package com.eshop.eshop.repository;

import com.eshop.eshop.modal.Address;
import com.eshop.eshop.modal.ItemSelected;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query(value="SELECT * FROM address u ORDER BY u.add_ID  DESC LIMIT 1", nativeQuery = true)
    List usergetAddressDetails();
}
