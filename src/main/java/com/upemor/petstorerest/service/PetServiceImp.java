package com.upemor.petstorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.upemor.petstorerest.model.Pet;
import com.upemor.petstorerest.repository.PetRepository;

@Service
public class PetServiceImp implements PetService {

	

	@Autowired
	private PetRepository petRepository;


	public List<Pet> listPets() {
		return petRepository.findAll();
	
	}

	public Pet findById(int id) {
		
		Pet pet =  petRepository.findById(id);
		return pet;
	}


	public void createPet(Pet pet) {
		petRepository.save(pet);
		
	}


	public Pet updatePet(Pet pet) {
		Pet currentPet = petRepository.findById(pet.getId());
		currentPet.setId(pet.getId());

		//Se guarda o no 
		petRepository.save(pet);
		
		
		return currentPet;
	}

	@Override
	public void deletePet(int id) {
		// TODO Auto-generated method stub
		petRepository.deleteById(id);
		
	}

}
