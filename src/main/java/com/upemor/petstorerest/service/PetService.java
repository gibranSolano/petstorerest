package com.upemor.petstorerest.service;

import java.util.List;


import com.upemor.petstorerest.model.Pet;

public interface PetService {
	
	

	List<Pet> listPets();
	
	Pet findById(int id);
	
	void createPet(Pet pet);
	
	Pet updatePet(Pet pet);
	
	void deletePet(int id);

}
