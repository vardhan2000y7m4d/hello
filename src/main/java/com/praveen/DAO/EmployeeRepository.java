package com.praveen.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
