package com.upemor.petstorerest.service;

import java.util.List;

import com.upemor.petstorerest.model.Category;

public interface CategoryService {
	
	
	List<Category> listCategorys();
	
	Category findById(int id);
	
	void createCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategory(int id);
	

}
