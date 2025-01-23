package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3School")
public class MyController {

	
//	Using Spring format.
	
	@RequestMapping(value="/html", method=RequestMethod.GET)
	public String FirstAPI() {
		return " HTML is used for frontend ";
	}
	
	@RequestMapping(value="/python", method=RequestMethod.POST)
	public String FourthAPI() {
		return " python is backend technology ";
	}
	
	
	@RequestMapping(value="/angular", method=RequestMethod.PUT)
	public String FifthAPI() {
		return " angular is used for frontend  technology ";
	}
	@RequestMapping(value="/c", method=RequestMethod.DELETE)
	public String sixthAPI() {
		return " C is simple language";
	}
	
	
	// Using Spring Boot Format.
	
	@PostMapping("/java")
	public String SecondAPI() {
		return " java is OOPS language";
	}
	
	
	@PutMapping("/css")
	public String ThirdAPI() {
		return " css is used for Scripting";
	}
	
	@GetMapping("/react")
	public String SeventhAPI() {
		return " react is fastest javascript library";
	}
	
	@DeleteMapping("/javascript")
	public String EightAPI() {
		return " javascript is mostly used for frontend Technology";
	}
}
