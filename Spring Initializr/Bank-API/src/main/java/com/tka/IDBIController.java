package com.tka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/IDBI")
public class IDBIController {
	
	@PostMapping("/deposit")
	public String Deposit() {
		return " Amount of 15000  has deposited on your IDBIBank account no:xxxxxxxx1423 ";
	}
	
	
	@PostMapping("/withdraw")
	public String Withdraw() {
		return " Amount of 5000 rs has withdrawn from your IDBIBank account no:xxxxxxxx1423";
	}
	

	@PostMapping("/check")
	public String CheckBalance() {
		return " Your Current Balance in IDBI bank is 10000 ";
	}

}
