package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DAO.StudentDAO;
import com.tka.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO dao;
	
	public String InsertData(Student s) {
	String msg = dao.InsertData(s);
	return msg;
		
	}

}
