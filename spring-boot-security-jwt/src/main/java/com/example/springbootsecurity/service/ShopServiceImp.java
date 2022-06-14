package com.example.springbootsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootsecurity.data.CartData;
import com.example.springbootsecurity.data.ProductData;
import com.example.springbootsecurity.data.UserData;
import com.example.springbootsecurity.repository.CartRepository;
import com.example.springbootsecurity.repository.ProductRepository;
import com.example.springbootsecurity.repository.UserRepository;



@Service
public class ShopServiceImp implements ShopService{

	
	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public void save(UserData userData) {
		userRepository.save(userData);
		
	}

	@Override
	public void save(CartData cartData) {
		cartRepository.save(cartData);
		
	}
	@Override
	public void saveAll(List<ProductData> data) {
		productRepository.saveAll(data);
		
	}

	@Override
	public void updateById(ProductData productData) {
		productRepository.updateById(productData.getProductPrice(), productData.getProductQuantity(),productData.getProductName());
		
	}


	
}

