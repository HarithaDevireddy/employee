package com.cg.emtoolapi.domain.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.emtoolapi.domain.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	Employee findByempName(String empName);
	
	

}
