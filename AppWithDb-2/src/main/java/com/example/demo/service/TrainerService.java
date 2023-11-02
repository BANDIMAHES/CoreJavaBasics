package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Trainer;
import com.example.demo.repository.TrainerReposoitory;

@Service
public class TrainerService {
	@Autowired
	private TrainerReposoitory trainerrepository;
	public List<Trainer> getAllTrainer() {
		return trainerrepository.findAll();
		
	}
	public Trainer addTrainer(Trainer t) {
		return this.trainerrepository.save(t);
	}

}
