package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int stud_id;
	private String stud_name;
	private String city;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int stud_id, String stud_name, String city) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.city = city;
	}



	public int getStud_id() {
		return stud_id;
	}



	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}



	public String getStud_name() {
		return stud_name;
	}



	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", city=" + city + "]";
	}
	
	
	
}
