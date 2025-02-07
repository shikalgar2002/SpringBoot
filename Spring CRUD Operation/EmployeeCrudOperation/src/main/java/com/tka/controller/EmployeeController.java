package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/insert")
	public String InsertData(@RequestBody Employee e) {
		es.InsertData(e);
		return "Data inserted Successfully....";
	}
	
//	@PutMapping("/update/{emp_id}")
//	public String UpdateData(@PathVariable int emp_id,@RequestBody Employee e) {
//		es.InsertData(e);
//		return "Data updated Successfully....";
//	}
	
	@DeleteMapping("/delete")
	public String DeleteData(@RequestParam int emp_id) {
		es.DeleteData(emp_id);
		
		return "Data Deleted Successfully...";
	}
	
	@GetMapping("/getbyid")
	public Optional<Employee> getbyId(@RequestParam int emp_id,   Employee Employee) {
		
		return es.getbyId(emp_id);
	}
	
	
	@GetMapping("/getall")
	public List<Employee> getall(Employee e) {
		
		return es.getall(e);
		
	}
	
	
	    @PutMapping("/update/{id}")
	    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
	        return es.updateEmployee(id, updatedEmployee);
	    }
	}


