package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Employee {
	@Id
	@GeneratedValue
	private Integer employeeId;
	private String employeeName;
	private double employeeSalary;
	private String emplyeeEmail;
	private Long employeeMobile;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmplyeeEmail() {
		return emplyeeEmail;
	}
	public void setEmplyeeEmail(String emplyeeEmail) {
		this.emplyeeEmail = emplyeeEmail;
	}
	public Long getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(Long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", emplyeeEmail=" + emplyeeEmail + ", employeeMobile=" + employeeMobile + "]";
	}
	
	

}
