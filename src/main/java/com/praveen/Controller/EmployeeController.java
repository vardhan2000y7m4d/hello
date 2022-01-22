package com.praveen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.praveen.Service.EmployeeService;
import com.praveen.entity.Employee;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/AllEmployees")
	public List<Employee> displayAllEmployees(){
		
		List<Employee> dispAllEmployees = es.dispAllEmployees();
		
		return dispAllEmployees;
	}
	
	@PostMapping("/createEmployee")
	public String createNewEmployee(@RequestBody Employee ob) {
		System.out.println(ob);
		//Employee ob1=new Employee(1,"praveen","delivary",32000.0F,"guntur");
		String createEmployee = es.createEmployee(ob);
		return createEmployee; 
	}
	
	@PutMapping("/updateEmployee/{id}")//localhost:8081/updateEmployee/3
	public String updateEmployee(@PathVariable Integer id,@RequestBody Employee ob) {
		String updateEmployeeDetails = es.updateEmployeeDetails(id,ob);
		return updateEmployeeDetails;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String DeleteEmployee(@PathVariable Integer id) {
		String deleteEmployee = es.deleteEmployee(id);
		return deleteEmployee;
	}

}
