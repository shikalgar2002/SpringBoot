package com.main.controller;

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

import com.main.entity.LaptopEntity;
import com.main.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService ls;
	
	@PostMapping("/insert")
	public String InsertData( @RequestBody LaptopEntity l) {
		ls.InsertData(l);
		
		return " Data inserted Successfully.....";
	}
	
	@PutMapping("/update")
	public LaptopEntity UpdateData(@RequestParam int lno,@RequestBody LaptopEntity le) {
		return ls.UpdateData(lno, le);
	}
	
	@DeleteMapping("/delete")
		public String DeleteData(@RequestParam int lno) {
		ls.DeleteData(lno);
		
		return "Data Deleted Successfully...";
		}
	
	@GetMapping("/getbyid/{lno}")
	public Optional<LaptopEntity>getbyid(@PathVariable int lno,LaptopEntity le){
		return ls.getbyid(lno, le);
		
	}
	
	@GetMapping("/getall")
	public List<LaptopEntity> getall(LaptopEntity le) {
		return ls.getall(le);
	}
	
	
	
	
	}

