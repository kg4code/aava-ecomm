package com.aava.service;

import com.aava.models.CartDTO;
import com.aava.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
