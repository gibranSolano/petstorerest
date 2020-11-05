package com.upemor.petstorerest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.upemor.petstorerest.model.Tag;



public interface TagRepository extends JpaRepository <Tag, Integer> {

Tag findById(int id);



}
