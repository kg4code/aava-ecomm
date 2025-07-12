package com.aava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aava.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
