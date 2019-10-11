package com.teste;

public class Calculadora {


	public int somar(String expressao) {
		int soma = 0;
		for (String valorSomar : expressao.split("\\+"))
			soma += Integer.valueOf(valorSomar);
		
		System.out.println(soma);
		return soma;
	}
}
