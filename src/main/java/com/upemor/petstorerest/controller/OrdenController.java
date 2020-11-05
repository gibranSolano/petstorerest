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

import com.upemor.petstorerest.model.Orden;
import com.upemor.petstorerest.service.OrdenService;
@RestController
@RequestMapping("/api/orden")
public class OrdenController {
	@Autowired
	private OrdenService ordenService;
	@GetMapping("/")
	public ResponseEntity<List<Orden>> listAllOrdens() {
	 List<Orden> ordens = ordenService.listOrdens();
	 return new ResponseEntity<List<Orden>>(ordens, HttpStatus.OK);
	 }
	@GetMapping("/{id}")
	public ResponseEntity<Orden> findById(@PathVariable("id") Integer id){
	 Orden orden= ordenService.findById(id);
	 return new ResponseEntity<Orden>(orden, HttpStatus.OK);

	 }
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orden> createOrden(@RequestBody final Orden orden) {
		ordenService.createOrden(orden);
	 return new ResponseEntity<Orden>(orden, HttpStatus.CREATED);
	 }
	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orden> updateOrden(@PathVariable("id") final int id, @RequestBody Orden
			orden) {
	 Orden updatedOrden = ordenService.updateOrden(orden);
	 return new ResponseEntity<Orden>(updatedOrden, HttpStatus.OK);
	 }
	@DeleteMapping("/{id}")
	public ResponseEntity<Orden> deleteOrden(@PathVariable("id") final int id) {
		ordenService.deleteOrden(id);
	 return new ResponseEntity<Orden>(HttpStatus.NO_CONTENT);
}
}
