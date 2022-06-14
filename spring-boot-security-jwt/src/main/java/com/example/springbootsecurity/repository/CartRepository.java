package com.example.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootsecurity.data.CartData;



public interface CartRepository extends JpaRepository<CartData ,Long >{

	

}
