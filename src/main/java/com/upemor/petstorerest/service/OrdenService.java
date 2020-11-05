package com.upemor.petstorerest.service;

import java.util.List;

import com.upemor.petstorerest.model.Orden;


public interface OrdenService {
	
	

	
	List<Orden> listOrdens();
	
	Orden findById(int id);
	
	void createOrden(Orden orden);
	
	Orden updateOrden(Orden orden);
	
	void deleteOrden(int id);
	

}
