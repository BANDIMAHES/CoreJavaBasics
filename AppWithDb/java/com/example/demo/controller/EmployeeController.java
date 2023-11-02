package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/all")
	public List<Employee> getallEmployees(){
		return this.employeeService.getAllEmployee();
	}
	@PostMapping("/adddata")
	public Employee addEmployee(@RequestBody Employee e) {
		return this.employeeService.addEmployee(e);
	}
	@DeleteMapping("dldata/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.dlEmployee(id);
	}
	@PutMapping("/update/{id}")
	public  Employee updateEmployee(@PathVariable int id,@RequestBody Employee e) {
		return employeeService.updateEmployee(id, e);
	
	}
//	@GetMapping("/search/{ename}")
//	public List<Employee>findByname(@PathVariable String ename){
//		return this.employeeService.getEmployeeByName(ename);
//	}
//	@GetMapping("/searchByKeyword")
//	public List<Employee>findByname1(){
//		return this.e.findByenameKeyword();
//
//}
	
}
