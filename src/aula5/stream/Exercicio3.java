package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}
	public Exercicio3() {
		List<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(aleatorio.nextInt(100));
		}
		System.out.println(numeros);
		System.out.println(numeros.stream().filter(num -> num == 25).count());
	}
}
