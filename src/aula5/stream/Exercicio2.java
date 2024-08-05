package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		List<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(aleatorio.nextInt(100));
		}
		System.out.println(numeros);
		System.out.println(numeros.stream().filter(num -> num > 50).mapToInt(Integer::intValue).average());
	}

}
