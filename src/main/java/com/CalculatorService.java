package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	int a = 20;
	int b = 10;
	
	@GetMapping("/sum")
	public int SumCalc(){
		int sum = a+b;
		return sum;
	}
	
	@GetMapping("/diff")
	public int DiffCalc(){
		int diff = a-b;
		return diff;
	}
	
	@GetMapping("/multiply")
	public int MultiplyCalc(){
		int multiply = a*b;
		return multiply;
	}
	
	@GetMapping("/mod")
	public int ModCalc(){
		int mod = a%b;
		return mod;
	}
	
	@GetMapping("/inc")
	public int IncCalc(){
		int inc = ++a;
		return inc;
	}
	
	@GetMapping("/dec")
	public int DecCalc(){
		int dec = --b;
		return dec;
	}
	
	@GetMapping("/isequal")
	public boolean EqualCalc(){
		boolean isequal = ((a == b) ? true:false);
		return isequal;
	}
	
	@GetMapping("/isgreater")
	public boolean GreaterCalc(){
		boolean isgreater = ((a > b) ? true:false);
		return isgreater;
	}
	
	@GetMapping("/islesser")
	public boolean LesserCalc(){
		boolean islesser = ((a < b) ? true:false);
		return islesser;
	}

}

