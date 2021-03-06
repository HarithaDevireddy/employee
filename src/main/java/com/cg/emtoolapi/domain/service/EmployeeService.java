package com.cg.emtoolapi.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emtoolapi.domain.Employee;
import com.cg.emtoolapi.domain.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveorUpdateCustomer(Employee employee) {
	
		return employeeRepository.save(employee);
	}

	public Employee findProjectByempName(String empName) {
		Employee employee=employeeRepository.findByempName(empName);
		
		return employee;
	}
	
    public List<Employee> findBySalaryDetails(double lower,double higher){
    	List<Employee> emps=employeeRepository.findBySalaryDetails(lower, higher);
		return emps;
    	
    }
}
