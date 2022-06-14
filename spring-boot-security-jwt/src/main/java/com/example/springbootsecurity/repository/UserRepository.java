package com.example.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootsecurity.data.UserData;


public interface UserRepository  extends JpaRepository<UserData , Long>{


}
