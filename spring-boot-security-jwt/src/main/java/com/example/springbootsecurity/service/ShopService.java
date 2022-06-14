package com.example.springbootsecurity.service;

import java.util.List;

import com.example.springbootsecurity.data.CartData;
import com.example.springbootsecurity.data.ProductData;
import com.example.springbootsecurity.data.UserData;


public interface ShopService {


	void save(UserData userData);

	void save(CartData cartData);

	void saveAll(List<ProductData> data);

	void updateById(ProductData productData);

}
