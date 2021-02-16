package com.cg.emtoolapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.emtoolapi.domain.Employee;
import com.cg.emtoolapi.domain.service.EmployeeService;

@RestController
@RequestMapping("/api/employeemanagement")
public class EmployeeController {
	@Autowired
   private EmployeeService employeeService;
	
	@PostMapping("")
	public ResponseEntity<Employee>createNewCustomer(@RequestBody Employee employee) {
		Employee emp=employeeService.saveorUpdateCustomer(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	@GetMapping("/{empName}")
	public ResponseEntity<?> getEmployeeById(@PathVariable String empName){
		Employee emp = employeeService.findProjectByempName(empName);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	@GetMapping("/{lower}/{higher}")
	public ResponseEntity<?> getEmployeeBySalaryDetails(@PathVariable double lower,@PathVariable double higher){
		List<Employee> emps = employeeService.findBySalaryDetails(lower,higher);
		return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
	
}
}
