package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Bruker {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

//	public Bruker() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	public static Bruker of(String firstName, String lastName, String email, String password) {
		return new Bruker(null,firstName,lastName,email, password ); 
	}
	@PersistenceConstructor
	private Bruker(Long id, String firstName, String lastName, String email, String password) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
	
}
