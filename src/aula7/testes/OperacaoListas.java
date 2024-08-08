package aula7.testes;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class OperacaoListas {

	// Exercicio1
	public int somaElementos(List<Integer> numeros) {
		return numeros.stream().mapToInt(Integer::intValue).sum();
	}

	// Exercicio2
	public OptionalDouble mediaElementosMaioresQue50(List<Integer> numeros) {
		return numeros.stream().filter(num -> num > 50).mapToInt(Integer::intValue).average();
	}

	// Exercicio3
	public long contarElementosIguaisA25(List<Integer> numeros) {
		return numeros.stream().filter(num -> num == 25).count();
	}
}
