package com.upemor.petstorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upemor.petstorerest.model.Orden;



public interface OrdenRepository extends JpaRepository <Orden, Integer> {


	Orden findById(int id);
	
}
