package com.example.demo.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
@Service

public class AdminServiceImpl implements AdminService {
	@Autowired
	
	
	private AdminRepository adminRepository;

	@Override
	public Admin registerAdmin(Admin admin) {
		adminRepository.save(admin);
		
		return adminRepository.save(admin);

	}

	@Override
	public Admin loginAdmin(Admin admin) {
		return adminRepository.findByAdminEmailIdAndAdminPassword(admin.getAdminEmailId(), admin.getAdminPassword()).orElseThrow(()->new ResourceNotFoundException("Admin", "id", "and Password"));
	
	}

}
