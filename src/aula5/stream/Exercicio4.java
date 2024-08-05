package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Lucas", "981485800", LocalDate.parse("2004-03-20")));
		pessoas.add(new Pessoa("Luis", "981485800", LocalDate.parse("2004-05-20")));
		pessoas.add(new Pessoa("Lucas", "981485800", LocalDate.parse("2004-08-20")));
		pessoas.add(new Pessoa("Lucas", "981485800", LocalDate.parse("2004-05-20")));
		pessoas.add(new Pessoa("Lucas", "981485800", LocalDate.parse("2004-04-20")));

		pessoas.stream().filter(elemento -> elemento.nome.contains("L")).sorted().forEach(System.out::println);;
	}
}
