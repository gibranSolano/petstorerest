package com.upemor.petstorerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upemor.petstorerest.model.Pet;
import com.upemor.petstorerest.service.PetService;


@RestController
@RequestMapping("/api/pet")
public class PetController {

	
	@Autowired
	private PetService petService;
	@GetMapping("/")
	public ResponseEntity<List<Pet>> listAllPets() {
	 List<Pet> pets = petService.listPets();
	 return new ResponseEntity<List<Pet>>(pets, HttpStatus.OK);
	 }
	@GetMapping("/{id}")
	public ResponseEntity<Pet> findById(@PathVariable("id") Integer id){
	 Pet pet= petService.findById(id);
	 return new ResponseEntity<Pet>(pet, HttpStatus.OK);

	 }
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pet> createPet(@RequestBody final Pet pet) {
		petService.createPet(pet);
	 return new ResponseEntity<Pet>(pet, HttpStatus.CREATED);
	 }
	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pet> updatePet(@PathVariable("id") final int id, @RequestBody Pet
			pet) {
	 Pet updatedPet = petService.updatePet(pet);
	 return new ResponseEntity<Pet>(updatedPet, HttpStatus.OK);
	 }
	@DeleteMapping("/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable("id") final int id) {
		petService.deletePet(id);
	 return new ResponseEntity<Pet>(HttpStatus.NO_CONTENT);
}
}
