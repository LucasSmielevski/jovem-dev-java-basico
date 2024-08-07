package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import aula6.outros.Exercicio5;


class Exercicio5Test {

	@Test
	void deveRetornarOValorDoRaio() {
		Exercicio5 exercicio = new Exercicio5();
		int circuferencia = 33;
		BigDecimal raio = new BigDecimal( circuferencia/ (2*Math.PI));
		
		assertEquals(raio.setScale(4, RoundingMode.HALF_EVEN), exercicio.calcularValorDoRaio());
		
	}

}
