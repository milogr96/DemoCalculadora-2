package com.Calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {
	
	private Operations operations;
	public Controller() {
	operations = new Operations(); 
	}
	
	@GetMapping("/hola")
	public String HolaMundo() {
		return "Hola Mundo";
	}
	
	@GetMapping("/add")
	public int add(@RequestParam int number1, @RequestParam int number2) {
		return operations.add(number1, number2);
	}
	
	@GetMapping("/substract")
	public int substract(@RequestParam int number1, @RequestParam int number2) {
		return operations.substract(number1, number2);
	}
	
	@GetMapping("/multiply")
	public int multiply(@RequestParam int number1, @RequestParam int number2) {
		return operations.multiply(number1, number2);
	}
	
	@GetMapping("/divide")
	public int divide(@RequestParam int number1, @RequestParam int number2) {
		return operations.divide(number1, number2);
	}	
		
}
