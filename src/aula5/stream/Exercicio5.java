package aula5.stream;

import java.util.ArrayList;
import java.util.List;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {

	public static void main(String[] args) {
		new Exercicio5();
	}

	public Exercicio5() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Lucas");
		nomes.add("Amanda");
		nomes.add("Alberto");
		nomes.add("Adalberto");
		nomes.add("Lucas");
		nomes.add("Lucas");

		try {
			System.out.println(nomes.stream()
					.filter(nome -> nome.endsWith("berto"))
					.findFirst().orElseThrow(() -> new ZeroBertoException("Nenhum resultado encontrado")));
		} catch (ZeroBertoException e) {
				System.out.println(e.getMessage());
		}
	}
}
