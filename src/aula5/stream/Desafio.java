package aula5.stream;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();

	}

	public Desafio() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Lucas", LocalDate.parse("2004-05-15")));
		pessoas.add(new Pessoa("Bruno", LocalDate.parse("1985-06-20")));
		pessoas.add(new Pessoa("Carlos", LocalDate.parse("1978-05-05")));
		pessoas.add(new Pessoa("Daniela", LocalDate.parse("1992-08-10")));
		pessoas.add(new Pessoa("Eduardo", LocalDate.parse("2000-05-25")));
		pessoas.add(new Pessoa("Fernanda", LocalDate.parse("1983-12-30")));
		pessoas.add(new Pessoa("Gabriel", LocalDate.parse("1995-03-17")));
		pessoas.add(new Pessoa("Amanda", LocalDate.parse("1997-05-09")));
		pessoas.add(new Pessoa("Igor", LocalDate.parse("2024-11-21")));
		pessoas.add(new Pessoa("Juliana", LocalDate.parse("1989-07-07")));
//
//		List<String> nomesFiltrados = pessoas.stream()
//				.filter(pessoa -> começaVogal(pessoa.nome) || Year.isLeap(pessoa.dataNascimento.getYear()))
//				.map(Pessoa::getNome).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
//
//				System.out.println(nomesFiltrados.stream().collect(Collectors.joining(";"))); 
	}

	public static boolean começaVogal(String nome) {
		char primLetra = Character.toLowerCase(nome.charAt(0));
		return primLetra == 'a' || primLetra == 'e' || primLetra == 'i' || primLetra == 'o' || primLetra == 'u';
	}

	public List<String> nomesQueComecamComVogalOuNasceramEmAnoBissexto(List<Pessoa> pessoas) {

		List<String> nomesFiltrados = pessoas.stream()
				.filter(pessoa -> começaVogal(pessoa.nome) || Year.isLeap(pessoa.dataNascimento.getYear()))
				.map(Pessoa::getNome).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
		return nomesFiltrados;

	}

}
