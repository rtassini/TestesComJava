package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {
	
	@Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA, valorB, valorC);
		
		assertEquals(6, soma);
	}
}
