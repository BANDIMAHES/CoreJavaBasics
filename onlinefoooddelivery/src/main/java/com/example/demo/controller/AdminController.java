package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin")

public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/register")
	public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) {
		Admin registerAdmin = adminService.registerAdmin(admin);
		return new ResponseEntity<Admin>(registerAdmin,HttpStatus.CREATED);
		
	}
	@PostMapping("/login")
	public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin) {
		Admin loginAdmin = adminService.loginAdmin(admin);
		return new ResponseEntity<>(loginAdmin,HttpStatus.ACCEPTED);
	}

}
