package com.aava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aava.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
