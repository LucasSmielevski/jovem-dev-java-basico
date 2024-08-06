package aula6.outros.enums;

import aula6.outros.CalculoInterface;

public enum Calculadora1Enum implements CalculoInterface {
	SOMA("Soma"), SUBTRACAO("Subtração"), DIVISAO("Divisão"), MULTIPLICACAO("Multiplicação");

	private String nomeAmigavel;

	private Calculadora1Enum(String nomeAmigavel) {
		this.nomeAmigavel = nomeAmigavel;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	@Override
	public int calcula(int n1, int n2, int n3) {
		if ("Soma".equals(getNomeAmigavel())) {
			return n1 + n2;
		}
		if ("Subtração".equals(getNomeAmigavel())) {
			return  n1 - n2;
		}
		if ("Divisão".equals(getNomeAmigavel())) {
			return  n1 / n2;
		}
		if ("Multiplicação".equals(getNomeAmigavel())) {
			return  n1 * n2;
		}
		return n3;
	}

}
