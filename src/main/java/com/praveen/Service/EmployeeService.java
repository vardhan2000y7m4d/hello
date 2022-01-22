package com.praveen.Service;

import java.util.List;

import com.praveen.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> dispAllEmployees();//select * from employee;//hetrogrnious ->it can accept the any type of data 
	public Employee displayEmployeeById(Integer id);//selet * from employee where eid=1110;
	public String createEmployee(Employee ob);//insert operation
	public String deleteEmployee(Integer id);//delete operation
	public String updateEmployeeDetails(Integer id,Employee ob);//update operetion 
}
