package com.example.springbootsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootsecurity.data.ProductData;


public interface ProductRepository extends JpaRepository<ProductData , Long>{

	void save(List<ProductData> data);

	@Transactional
	@Modifying
	@Query (value ="update product set productName =:productName , productQuantity=:productQuantity , productPrice=:productPrice where productId=:productId", nativeQuery =true)
	void updateById(Double productPrice, Integer productQuantity, String productName);

	
//    void updateById(@Param ("id") Long id,  @Param ("name") String name, @Param ("std") Long std);

	
	
}
