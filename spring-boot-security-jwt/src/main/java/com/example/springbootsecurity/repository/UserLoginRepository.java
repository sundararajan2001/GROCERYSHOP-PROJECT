package com.example.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootsecurity.data.DAOUser;


@Repository
public interface UserLoginRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

}