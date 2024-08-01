package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}
	
	public Exercicio1() {
		List<Integer> numeros = new ArrayList<Integer>();
		Random aleat = new Random();
		for (int i = 0; i < 51; i++) {
			numeros.add(aleat.nextInt(1000));
		}
		numeros.forEach(System.out::println);
	}

}
