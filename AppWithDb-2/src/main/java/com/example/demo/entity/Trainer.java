package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "s1",sequenceName = "g1", initialValue = 1000)
@Table(name = "trainer1")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "s1")
	int id;
	@Column(name = "tname")
	String tname;
	int salary;
	public int getId() {
		return id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Trainer(int id, String tname, int salary) {
		super();
		this.id = id;
		this.tname = tname;
		this.salary = salary;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

	