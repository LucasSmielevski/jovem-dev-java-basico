package aula6.outros;

import aula6.outros.enums.Calculadora1Enum;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		for (Calculadora1Enum c : Calculadora1Enum.values()) {
			System.out.println(c.getNomeAmigavel() + " Resultado: " + c.calcula(5, 2, 0));
		}

	}

}
