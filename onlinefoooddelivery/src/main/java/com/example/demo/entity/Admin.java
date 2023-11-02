package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admin_table")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	 @NotEmpty
	 @Size(min=3, message="first  name must contain at least 3 characters" )
	 private String firstName;
	 
	 
	
	@NotEmpty
	 @Size(min=3, message="first name must contain at least 3 characters" )
	 private String lastName;
	
	@NotEmpty
	@Email(message = "Email is not valid")
	private String adminEmailId;
	
	@NotEmpty
	@Size(min=8, message="password length must be 8 and contain uppercase,lowercase,digits")
	private String adminPassword;
	

}
