package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	int m1 = 20;
	int m2 = 10;
	
	@Test
	public void testSum() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testSum");
		Assertions.assertEquals(30, calc.SumCalc());
	}
	
	@Test
	public void testDiff() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testDiff");
		Assertions.assertEquals(10, calc.DiffCalc());
	}

	
	@Test
	public void testMul() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testMul");
		Assertions.assertEquals(200, calc.MultiplyCalc());
	}
	
	@Test
	public void testMod() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testMod");
		Assertions.assertEquals(0, calc.ModCalc());
	}
	
	@Test
	public void testInc() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testInc");
		Assertions.assertEquals(21, calc.IncCalc());
	}
	
	@Test
	public void testDec() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testDec");
		Assertions.assertEquals(9, calc.DecCalc());
	}
	
	@Test
	public void testIsEqual() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testIsEqual");
		Assertions.assertEquals(false, calc.EqualCalc());
	}
	
	@Test
	public void testIsGreater() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testIsGreater");
		Assertions.assertEquals(true, calc.GreaterCalc());
	}
	
	@Test
	public void testIsLesser() {
		CalculatorService calc = new CalculatorService();
		System.out.println("testIsLesser");
		Assertions.assertEquals(false, calc.LesserCalc());
	}
	
	
}