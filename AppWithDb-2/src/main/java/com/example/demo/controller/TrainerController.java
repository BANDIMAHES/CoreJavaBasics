package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trainer;
import com.example.demo.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	@GetMapping("/all")
	public List<Trainer> getAllEmployees(){
		return this.trainerService.getAllTrainer();
	}
}
	

