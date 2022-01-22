package com.praveen.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.DAO.EmployeeRepository;
import com.praveen.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er;
	
	@Override
	public List<Employee> dispAllEmployees() {
		
		List<Employee> empdetails = er.findAll();
		return empdetails;
	}

	@Override
	public Employee displayEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		 Employee employee = er.findById(id).get();
		return employee;
	}

	@Override
	public String createEmployee(Employee ob) {
		// TODO Auto-generated method stub
		er.save(ob);
		
		return "Employee profile created successfully";
	}

	@Override
	public String deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
		er.deleteById(id);
		return "Employee deleted successfully";
	}

	@Override
	public String updateEmployeeDetails(Integer id,Employee ob) {
		// TODO Auto-generated method stub
		//Employee employee = er.findById(id).get();
		ob.setId(id);
		 er.save(ob);
		return "Employee details are updated successfully";
	}

}
