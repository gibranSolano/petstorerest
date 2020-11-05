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

import com.upemor.petstorerest.model.Tag;
import com.upemor.petstorerest.service.TagService;
@RestController
@RequestMapping("/api/tag")
public class TagController {
	@Autowired
	private TagService tagService;
	@GetMapping("/")
	public ResponseEntity<List<Tag>> listAllTags() {
	 List<Tag> tags = tagService.listAllTags();
	 return new ResponseEntity<List<Tag>>(tags, HttpStatus.OK);
	 }
	@GetMapping("/{id}")
	public ResponseEntity<Tag> findById(@PathVariable("id") Integer id){
		Tag tag = tagService.findById(id);
	 return new ResponseEntity<Tag>(tag, HttpStatus.OK);

	 }
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tag> createTag(@RequestBody final Tag tag) {
		tagService.createTag(tag);
	 return new ResponseEntity<Tag>(tag, HttpStatus.CREATED);
	 }
	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tag> updateTag(@PathVariable("id") final int id, @RequestBody Tag
	tag) {
		Tag updatedTag = tagService.updateTag(tag);
	 return new ResponseEntity<Tag>(updatedTag, HttpStatus.OK);
	 }
	@DeleteMapping("/{id}")
	public ResponseEntity<Tag> deleteTag(@PathVariable("id") final int id) {
		tagService.deleteTag(id);
	 return new ResponseEntity<Tag>(HttpStatus.NO_CONTENT);
}
}