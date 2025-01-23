package com.tka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FoodOrdering")
public class MyController {
	
	
	@RequestMapping(value="/paneermasala", method=RequestMethod.GET)
	public String PaneerMasala() {
		
		return " order 2 plate paneer masala";
	}
	
	@RequestMapping(value="/chickenmasala", method=RequestMethod.POST)
	public String ChickenMasala() {
		
		return " order 3 plate chicken masala";
	}
	
	@RequestMapping(value="/biryani", method=RequestMethod.PUT)
	public String Biryani() {
		
		return " order 2 plate Biryani ";
	}
	
	@RequestMapping(value="/jeerarice", method=RequestMethod.DELETE)
	public String JeeraRice() {
		
		return " order 1 plate jeera rice";
	}
	
	@RequestMapping(value="/masalaPapad", method=RequestMethod.PATCH)
	public String MasalaPapad() {
		
		return " order 2 piece of masala papad";
	}
	
	
//	@RequestMapping(value="/tandoorroti", method=RequestMethod.HEAD)
//	public String TandoorRoti() {
//		
//		return " roti";
//	}
	
}
