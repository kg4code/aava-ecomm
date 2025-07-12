package com.aava.service;

import com.aava.exception.CartItemNotFound;
import com.aava.exception.ProductNotFoundException;
import com.aava.models.Cart;
import com.aava.models.CartDTO;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFoundException;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
