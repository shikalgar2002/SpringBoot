package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ICICI")
public class ICICIBankController {
	
	@PostMapping("/deposit")
	public String Deposit() {
		return " Amount of 10000  has deposited on your ICICIBank account no:xxxxxxxx2314 ";
	}
	
	@PostMapping("/withdraw")
	public String Withdraw() {
		return " Amount of 1000 rs has withdrawn from your ICICIBank account no:xxxxxxxx2314";
	}
	
	@PostMapping("/check")
	public String CheckBalance() {
		return " Your Current Balance in ICICI bank is 9500 ";
	}

}
