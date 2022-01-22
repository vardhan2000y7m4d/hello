package com.praveen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="Emp_Id")
	@GeneratedValue
	int id;
	
	@Column(name="Emp_Name")
	String name;
	
	@Column(name="Emp_Dept")
	String dept;
	
	@Column(name="Emp_Sal")
	double sal;
	
	@Column(name="Emp_Add")
	String add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Employee(int id, String name, String dept, double sal, String add) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.add = add;
	}
	

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", Add=" + add + "]";
	}
	
	
	

}
