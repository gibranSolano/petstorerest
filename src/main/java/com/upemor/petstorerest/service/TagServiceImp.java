package com.upemor.petstorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petstorerest.model.Tag;
import com.upemor.petstorerest.repository.TagRepository;

@Service
public class TagServiceImp implements TagService{

	@Autowired
	private TagRepository TagRepository;
	
	public List<Tag> listAllTags(){
	return TagRepository.findAll();

	}
	public Tag findById(int id) {
		Tag tag = TagRepository.findById(id);
	return tag;
	}

	public void createTag(Tag tag) {
	//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	//Tag.setPassword(encoder.encode(Tag.getPassword(password));
	TagRepository.save(tag);
	}
	public Tag updateTag(Tag tag) {
		Tag  currentTag= TagRepository.findById(tag.getId());
		currentTag.setId(tag.getId());

	return currentTag;

}
	@Override
	public void deleteTag(int id) {
		// TODO Auto-generated method stub
		
		
		
	}
}
