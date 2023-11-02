package com.example.demo.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class ProjectEx {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String createat;
	private String updateat;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "projectex_emp",joinColumns = @JoinColumn(name = "p_id",referencedColumnName = "pid"),
	inverseJoinColumns = @JoinColumn(name = "e_id", referencedColumnName = "e_id"))
	private Set<Employee2> emp = new HashSet<Employee2>();
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCreateat() {
		return createat;
	}
	public void setCreateat(String createat) {
		this.createat = createat;
	}
	public String getUpdateat() {
		return updateat;
	}
	public void setUpdateat(String updateat) {
		this.updateat = updateat;
	}
	public Set<Employee2> getEmp() {
		return emp;
	}
	public void setEmp(Set<Employee2> emp) {
		this.emp = emp;
	}
	public ProjectEx(int pid, String pname, String createat, String updateat, Set<Employee2> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.createat = createat;
		this.updateat = updateat;
		this.emp = emp;
	}
	public ProjectEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
