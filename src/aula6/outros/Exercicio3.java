package aula6.outros;

import aula6.outros.enums.Calculadora2Enum;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		for (Calculadora2Enum c : Calculadora2Enum.values()) {
			System.out.println(c.getNomeAmigavel() + " Resultado: " + c.getCalculo().apply(5, 2));
		}
	}

}
