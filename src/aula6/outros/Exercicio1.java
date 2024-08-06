package aula6.outros;

import aula6.outros.enums.DiaSemanaEnum;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		for (DiaSemanaEnum ds : DiaSemanaEnum.values()) {
			System.out.println(ds.getNome() + " - " + ds.isFimDeSemana(ds.getNome()));
		}
	}

}
