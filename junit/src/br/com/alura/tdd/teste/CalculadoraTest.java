package br.com.alura.tdd.teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.Calculadora;


public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(3, 7);
		
		Assert.assertEquals(10,	resultado);
	
	}

}
