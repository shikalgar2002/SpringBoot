package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDAO;
import com.tka.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO ed;
	
	
	
	
	public void InsertData(Employee e ) {
		
		ed.save(e);
			
	}
	
	public void DeleteData(int emp_id) {
		ed.deleteById(emp_id);
	}
	
	public Optional<Employee> getbyId(int emp_id) {
		 return ed.findById(emp_id);
	}
	
	
	public List<Employee> getall(Employee e) {
		return ed.findAll();
		
	}
	
	
	
	
	
	
	
	

	    public Employee updateEmployee(int emp_id, Employee updatedEmployee) {
	        Optional<Employee> existingEmployeeOpt = ed.findById(emp_id);

	        if (existingEmployeeOpt.isPresent()) {
	            Employee existingEmployee = existingEmployeeOpt.get();
	            existingEmployee.setName(updatedEmployee.getName());
	            existingEmployee.setSalary(updatedEmployee.getSalary());
	            existingEmployee.setCity(updatedEmployee.getCity());

	            return ed.save(existingEmployee); // Updates existing employee
	        } else {
	            throw new RuntimeException("Employee not found with ID: " + emp_id);
	        }
	    }
	}

	

