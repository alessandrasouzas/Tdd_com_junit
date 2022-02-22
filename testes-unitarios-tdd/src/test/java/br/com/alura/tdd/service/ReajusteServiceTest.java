package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	
	/*Cenarios para testar:
	 * Se o desempenho foi "A desejar", reajuste sera de apenas 3% do salario;
	 * Se o desempenho foi "bom", reajuste sera de apenas 15% do salario;
	 * Se o desempenho foi "Otimo", reajuste sera de apenas 20% do salario;
	 */


	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(funcionario,	Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());		
	}
}
