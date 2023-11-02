package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeReposoitory;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeReposoitory employeeReposoitory;
	public List<Employee> getAllEmployee(){
		return employeeReposoitory.findAll();
	}
	public Employee addEmployee(Employee e) {
		return this.employeeReposoitory.save(e);
	}
	public void dlEmployee(int id) {
		employeeReposoitory.deleteById(id);
	}
	public Employee updateEmployee(int id,Employee e) {
		e.setId(id);
		return employeeReposoitory.save(e);
		
	}
//	public List<Employee> findByName(String ename){
//		return this.employeeReposoitory.findByEmpoyeeName(ename);
//	}
	//to search by price
//	public List<Employee> findByPrice(int price){
//		return this.employeeReposoitory(price);
//	}

}
