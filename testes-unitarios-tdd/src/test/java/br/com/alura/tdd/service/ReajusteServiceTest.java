package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	/*Cenarios para testar:
	 * Se o desempenho foi "A desejar", reajuste sera de apenas 3% do salario;
	 * Se o desempenho foi "bom", reajuste sera de apenas 15% do salario;
	 * Se o desempenho foi "Otimo", reajuste sera de apenas 20% do salario;
	 */

	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));		
	}

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario,	Desempenho.A_DESEJAR);		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());		
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		service.concederReajuste(funcionario,	Desempenho.BOM);		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());		
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(funcionario,	Desempenho.OTIMO);	
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());		
	}

}
