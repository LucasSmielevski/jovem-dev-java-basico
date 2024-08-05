package aula5.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		List<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(aleatorio.nextInt(100));
		}

		System.out.println(numeros);
		System.out.println(numeros.stream().mapToInt(Integer::intValue).sum());
	}
}
