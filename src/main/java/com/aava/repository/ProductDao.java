package com.aava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aava.models.CategoryEnum;
import com.aava.models.Product;
import com.aava.models.ProductDTO;
import com.aava.models.ProductStatus;


@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	
	@Query("select new com.aava.models.ProductDTO(p.productName,p.manufacturer,p.price,p.quantity) "
			+ "from Product p where p.category=:catenum")
	public List<ProductDTO> getAllProductsInACategory(@Param("catenum") CategoryEnum catenum);
	
	
	@Query("select new com.aava.models.ProductDTO(p.productName,p.manufacturer,p.price,p.quantity) "
			+ "from Product p where p.status=:status")
	public List<ProductDTO> getProductsWithStatus(@Param("status") ProductStatus status);
	
	@Query("select new com.aava.models.ProductDTO(p.productName,p.manufacturer,p.price,p.quantity) "
			+ "from Product p where p.seller.sellerId=:id")
	public List<ProductDTO> getProductsOfASeller(@Param("id") Integer id);
	

}
