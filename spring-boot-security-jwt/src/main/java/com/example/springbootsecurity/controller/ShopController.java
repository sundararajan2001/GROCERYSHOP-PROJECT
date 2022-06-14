package com.example.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsecurity.data.CartData;
import com.example.springbootsecurity.data.ManyDetails;
import com.example.springbootsecurity.data.ProductData;
import com.example.springbootsecurity.data.ResponseData;
import com.example.springbootsecurity.data.UserData;
import com.example.springbootsecurity.service.ShopService;
import com.example.springbootsecurity.validation.ShopValidation;



@RestController
@RequestMapping("/groceryShop")
public class ShopController {
	@Autowired
	ShopService shopService;
	@PostMapping("/insertUserData")
	public ResponseEntity<ResponseData<String>> insertUserData(@RequestBody UserData userData){
		ResponseEntity<ResponseData<String>>validation = ShopValidation.insertUserData(userData , shopService);
		if(validation.getStatusCode().value()==200) {
			shopService.save(userData);
			return validation;
		}
		return validation;
	}
	@PostMapping("/insertCartData")
	public ResponseEntity<ResponseData<String>> insertCartData(@RequestBody CartData cartData){
		ResponseEntity<ResponseData<String>>validation = ShopValidation.insertCartData(cartData , shopService);
		if(validation.getStatusCode().value()==200) {
			shopService.save(cartData);
			return validation;
		}
		return validation;
	}
	@PostMapping("/insertProductData")
	public ResponseEntity<ResponseData<String>> insertProductData(@RequestBody ManyDetails manyDetails){
		ResponseEntity<ResponseData<String>>validation = ShopValidation.insertProductData(manyDetails , shopService);
		if(validation.getStatusCode().value()==200) {
			shopService.saveAll(manyDetails.getData());
			return validation;
		}
		return validation;
	}
	

	@PutMapping("/updateById")
	public ResponseEntity<ResponseData<String>> updateById(@RequestBody ProductData productData){
	    ResponseEntity<ResponseData<String>>validation = ShopValidation.updateById(productData, shopService);
	    if(validation.getStatusCode().value()==200) {
	    	shopService.updateById(productData);
	    	return validation;
	    }
	    return validation;
	}
	
	
}

