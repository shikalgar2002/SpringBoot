package com.tka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Indian")
public class IndianBankController {
	
	@PostMapping("/deposit")
	public String Deposit() {
		return " Amount of 20000  has deposited on your IndianBank account no:xxxxxxxx23414 ";
	}
	
	@PostMapping("/withdraw")
	public String Withdraw() {
		return " Amount of 1500 rs has withdrawn from your IndianBank account no:xxxxxxxx23414";
	}
	

	@PostMapping("/check")
	public String CheckBalance() {
		return " Your Current Balance in Indian bank is 18500 ";
	}

}
