package com.airline;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Airlines")
public class MyController {

	
	@GetMapping("/AA")
	public String AmericanAirLines() {
		
		return " American Airlines (AA) tops the list with an impressive seat capacity of over 66 million for Q1 2025 ";
	}
	
	@PostMapping("/DA")
	public String DeltaAirLines() {
		
		return " With over 57 million seats on offer, Delta Air Lines (DL) secures second place. ";
	}
	
	@PutMapping("/SWA")
	public String SouthWestAirLines() {
		
		return " Southwest Airlines (WN), with a seat capacity exceeding 53 million, dominates the U.S. domestic travel market ";
	}
	
	@DeleteMapping("/UA")
	public String UnitedAirLines() {
		
		return " United Airlines (UA), with a capacity of over 52 million seats, capitalizes on its strategically located hubs across the U.S ";
	}
	
	@PatchMapping("/CEA")
	public String ChinaEasternAirLines() {
		
		return "Ranking sixth on the global stage, China Eastern Airlines (MU) leads the Asia-Pacific carriers offering over 38 million seats in Q1 2025.";
	}
	
	
}
