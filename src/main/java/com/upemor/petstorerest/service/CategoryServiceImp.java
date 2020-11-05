package com.upemor.petstorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petstorerest.model.Category;

import com.upemor.petstorerest.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	
	public List<Category> listCategorys() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}


	public Category findById(int id) {
		// TODO Auto-generated method stub
		
		Category Category =  categoryRepository.findById(id);
		return Category;
	}


	public void createCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
		
	}


	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		Category currentCategory= categoryRepository.findById(category.getId());
		currentCategory.setId(category.getId());

		//Se guarda o no 
		categoryRepository.save(category);
		
		
		return currentCategory;
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		
		categoryRepository.deleteById(id);
		
	}

}
