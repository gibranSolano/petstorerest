package com.upemor.petstorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petstorerest.model.Orden;

import com.upemor.petstorerest.repository.OrdenRepository;



@Service
public class OrdenServiceImp implements OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;

	
	public List<Orden> listOrdens() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}


	public Orden findById(int id) {
		// TODO Auto-generated method stub
		
		Orden orden =  ordenRepository.findById(id);
		return orden;
	}


	public void createOrden(Orden orden) {
		// TODO Auto-generated method stub
		ordenRepository.save(orden);
		
	}


	public Orden updateOrden(Orden orden) {
		// TODO Auto-generated method stub
		Orden currentOrder = ordenRepository.findById(orden.getId());
		currentOrder.setId(orden.getId());

		//Se guarda o no 
		ordenRepository.save(orden);
		
		
		return currentOrder;
	}

	@Override
	public void deleteOrden(int id) {
		// TODO Auto-generated method stub
		
		ordenRepository.deleteById(id);
		
	}

}
