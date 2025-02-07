package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
