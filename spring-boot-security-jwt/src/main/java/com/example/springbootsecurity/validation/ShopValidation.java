package com.example.springbootsecurity.validation;

import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.example.springbootsecurity.data.CartData;
import com.example.springbootsecurity.data.ManyDetails;
import com.example.springbootsecurity.data.ProductData;
import com.example.springbootsecurity.data.ResponseData;
import com.example.springbootsecurity.data.UserData;
import com.example.springbootsecurity.service.ShopService;



public class ShopValidation {

	public static ResponseEntity<ResponseData<String>> insertUserData(UserData userData, ShopService shopService) {
		ResponseData<String> response = new ResponseData<String>();
		response.setStatusCode(400);
		
		if(userData.getCustomerName()==null ||userData.getCustomerName().isEmpty()) {
			response.setMessage("Enter the Name");
			return ResponseEntity.badRequest().body(response);			
		}
		if(userData.getCustomerRole()==null ||userData.getCustomerRole().isEmpty()) {
			response.setMessage("Enter the Role");
			return ResponseEntity.badRequest().body(response);			
		}
		
		if(userData.getCustomerNum()==0) {
			response.setMessage("Enter the Std");
			return ResponseEntity.badRequest().body(response);
		}
		
		userData.setUpdatedAt(new Date());
		userData.setCreatedAt(new Date());
		
		response.setStatusCode(200);
		response.setMessage("Data Inserted Successfully");
		return ResponseEntity.ok(response);

	}

	public static ResponseEntity<ResponseData<String>> insertCartData(CartData cartData, ShopService shopService) {
		
		ResponseData<String> response = new ResponseData<String>();
		response.setStatusCode(400);
		
		if(cartData.getUserData().getCustomerId()==0) {
			response.setMessage("Enter the UserId");
			return ResponseEntity.badRequest().body(response);			
		}
		if(cartData.getProductData().getProductId()==0) {
			response.setMessage("Enter the Product Id");
			return ResponseEntity.badRequest().body(response);			
		}
		
		if(cartData.getCartQuantity()==0) {
			response.setMessage("Enter the Std");
			return ResponseEntity.badRequest().body(response);
		}
		
		response.setStatusCode(200);
		response.setMessage("Cart Inserted Successfully");
		return ResponseEntity.ok(response);
		
	}

	public static ResponseEntity<ResponseData<String>> insertProductData(ManyDetails manyDetails,
			ShopService shopService) {
		
		ResponseData<String> response = new ResponseData<String>();
		response.setStatusCode(400);
		for(int i = 0;i< manyDetails.getData().size(); i++) {
			ProductData productData = manyDetails.getData().get(i);
		if(productData.getProductName()==null ||productData.getProductName().isEmpty()) {
			response.setMessage("Enter the Product Name");
			return ResponseEntity.badRequest().body(response);			
		}
		
		if(productData.getProductPrice()==0) {
			response.setMessage("Enter the product Price");
			return ResponseEntity.badRequest().body(response);
		}
		
		if(productData.getProductQuantity()==0) {
			response.setMessage("Enter the Product quantity");
			return ResponseEntity.badRequest().body(response);
		}
		productData.setUpdatedAt(new Date());
		productData.setCreatedAt(new Date());
		
		}
		response.setStatusCode(200);
		response.setMessage("Products Inserted Successfully");
		return ResponseEntity.ok(response);
	}

	public static ResponseEntity<ResponseData<String>> updateById(ProductData productData, ShopService shopService) {
		ResponseData<String> response = new ResponseData<String>();
		response.setStatusCode(400);
			if(productData.getProductPrice()==0) {
				response.setMessage("Enter the Product Price");
				return ResponseEntity.badRequest().body(response);
			}
			if(productData.getProductName()==null ||productData.getProductName().isEmpty()) {
				response.setMessage("Enter the Product Name");
				return ResponseEntity.badRequest().body(response);			
			}	
			if(productData.getProductQuantity()==0) {
				response.setMessage("Enter the Product Quantity");
				return ResponseEntity.badRequest().body(response);
			}
			productData.setUpdatedAt(new Date());
			productData.setCreatedAt(new Date());
            
	      
		response.setStatusCode(200);
	    response.setMessage("Product Data Updated Successfully");
     	return ResponseEntity.ok(response);
		
}
}