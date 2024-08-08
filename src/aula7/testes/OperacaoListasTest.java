package aula7.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class OperacaoListasTest {

	private OperacaoListas operacaoListas;
	private List<Integer> numeros;

	@BeforeEach
	public void setup() {
		operacaoListas = new OperacaoListas();
		numeros = Arrays.asList(10, 25, 50, 75, 100, 25, 30, 55, 60, 25);
	}

	@Test
	public void SomaElementos() {
		int soma = operacaoListas.somaElementos(numeros);
		assertEquals(455, soma);
	}

	@Test
	public void MediaElementosMaioresQue50() {
		OptionalDouble mediaEsperada = OptionalDouble.of(72.5);
		OptionalDouble media = operacaoListas.mediaElementosMaioresQue50(numeros);
		assertEquals(mediaEsperada.getAsDouble(), media.getAsDouble());
	}

	@Test
	public void ContarElementosIguaisA25() {
		long contagem = operacaoListas.contarElementosIguaisA25(numeros);
		assertEquals(3, contagem);
	}
}
