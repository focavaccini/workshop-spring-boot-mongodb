package com.workshopmongo.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	@NotEmpty(message = "Mandatory completion")
	@Length(min = 5, max = 120, message =  "Size must be between 5 and 120 characters")
	private String name;
	
	@NotEmpty(message = "Mandatory completion")
	@Email(message = "Invalid email")
	private String email;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
