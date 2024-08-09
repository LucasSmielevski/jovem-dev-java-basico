package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula6.outros.enums.Calculadora2Enum;

class Calculadora2EnumTest {

	@DisplayName("A soma de 10 e 5 deve ser 15.")
	@Test
	public void testSoma() {
		int resultado = Calculadora2Enum.SOMA.getCalculo().apply(10, 5);
		assertEquals(15, resultado);
	}

	@DisplayName("A subtração de 10 e 5 deve ser 5.")
	@Test
	public void testSubtracao() {
		int resultado = Calculadora2Enum.SUBTRACAO.getCalculo().apply(10, 5);
		assertEquals(5, resultado);
	}

	@DisplayName("A divisão de 10 por 5 deve ser 2.")
	@Test
	public void testDivisao() {
		int resultado = Calculadora2Enum.DIVISAO.getCalculo().apply(10, 5);
		assertEquals(2, resultado);
	}

	@DisplayName("A divisão por zero deve lançar uma ArithmeticException.")
	@Test
	public void testDivisaoPorZero() {
		assertThrows(ArithmeticException.class, () -> {
			Calculadora2Enum.DIVISAO.getCalculo().apply(10, 0);
		});
	}

	@DisplayName("A multiplicação de 10 por 5 deve ser 50.")
	@Test
	public void testMultiplicacao() {
		int resultado = Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(10, 5);
		assertEquals(50, resultado);
	}

	@DisplayName("Deve retornar o nome amigavel de cada operação")
	@Test
	public void testNomeAmigavel() {
		assertEquals("Soma", Calculadora2Enum.SOMA.getNomeAmigavel());
		assertEquals("Subtração", Calculadora2Enum.SUBTRACAO.getNomeAmigavel());
		assertEquals("Divisão", Calculadora2Enum.DIVISAO.getNomeAmigavel());
		assertEquals("Multiplicação", Calculadora2Enum.MULTIPLICACAO.getNomeAmigavel());
	}

}
