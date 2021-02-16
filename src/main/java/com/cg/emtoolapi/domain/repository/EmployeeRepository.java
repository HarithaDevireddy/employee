package com.cg.emtoolapi.domain.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.emtoolapi.domain.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	Employee findByempName(String empName);
	
	@Query(value = "Select emp from Employee emp where emp.salary>=:lower and emp.salary<=:higher")
	public List<Employee> findBySalaryDetails(double lower,double higher);
	
	
	
	

}
