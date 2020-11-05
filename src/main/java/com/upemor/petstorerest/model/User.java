package com.upemor.petstorerest.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String password;
	
	private boolean status;
	
	private String role; 
	
	@OneToMany(mappedBy = "user", cascade = {
	        CascadeType.ALL
	    })
	
	private List < Orden > orden;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String firstname, String lastname, String email, String password, boolean status, String role) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.status = status;
		this.role = role; 
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
