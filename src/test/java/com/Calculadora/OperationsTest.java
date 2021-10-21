package com.Calculadora;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperationsTest{
		private Operations calculadora;
		
public void escenario() {
	calculadora= new Operations();
}
	
	@Test
	public void add() {
		escenario();
		assertTrue(calculadora.add(3,3)==(6));
		assertFalse(calculadora.add(3,3)==(8));
	}
	
	@Test
	public void substract() {
		escenario();
		assertTrue(calculadora.substract(3,3)==(0));
		assertFalse(calculadora.substract(3,3)==(10));
	}
	
	@Test
	public void multiply() {
		escenario();
		assertTrue(calculadora.multiply(3,3)==(9));
		assertFalse(calculadora.multiply(3,3)==(12));
	}
	
	@Test
	public void divide() {
		escenario();
		assertTrue(calculadora.divide(3,3)==(1));
		assertFalse(calculadora.divide(3,3)==(15));
	}
	
	
}
