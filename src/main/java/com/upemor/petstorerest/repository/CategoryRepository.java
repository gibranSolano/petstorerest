package com.upemor.petstorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upemor.petstorerest.model.Category;



public interface CategoryRepository extends JpaRepository <Category, Integer> {

	Category findById(int id);

}
