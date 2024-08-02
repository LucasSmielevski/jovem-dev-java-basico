package aula4.lambda;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(1, "Pedro", LocalDate.parse("20/03/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(2, "Lucas", LocalDate.parse("30/10/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(3, "Gabriel", LocalDate.parse("15/05/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(4, "Luis", LocalDate.parse("06/11/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(5, "Léo", LocalDate.parse("28/08/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

		alunos.stream().sorted(Comparator.comparing(Aluno::getDataNascimento)).map(Aluno::getNome)
				.forEach(System.out::println);
	}

}
