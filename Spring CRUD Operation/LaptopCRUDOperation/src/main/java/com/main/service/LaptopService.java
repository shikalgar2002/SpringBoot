package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.LaptopDAO;
import com.main.entity.LaptopEntity;

@Service
public class LaptopService {

	@Autowired
	LaptopDAO ld;
	
	
	public void InsertData(LaptopEntity l) {
		ld.save(l);
		
	}
	
	
	public LaptopEntity UpdateData(int lno,LaptopEntity le) {
		Optional<LaptopEntity> s =ld.findById(lno);
		
		if(s.isPresent()) {
			LaptopEntity w =s.get();
			w.setName(le.getName());
			w.setColor(le.getColor());
			w.setRam(le.getRam());
			w.setRom(le.getRom());
			
			return ld.save(w);
		}
		else {
			throw new RuntimeException("Laptop not found with these id: " + lno);
		}
		
	}
	
	public void DeleteData(int lno) {
		ld.deleteById(lno);
	}
	
	
	public Optional<LaptopEntity> getbyid(int lno, LaptopEntity le) {
		
		
		return ld.findById(lno); 
		
	}
	
	public List<LaptopEntity>getall(LaptopEntity le){
		
		return ld.findAll();
	}
}
