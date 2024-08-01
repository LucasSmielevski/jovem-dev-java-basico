package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(1, "Lucas", LocalDate.parse("20/03/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(2, "Tiago", LocalDate.parse("20/01/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(3, "Gabriel", LocalDate.parse("20/06/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(4, "Thiago", LocalDate.parse("20/09/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		alunos.add(new Aluno(5, "Léo", LocalDate.parse("20/10/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
//		alunos.add(new Aluno("Lucas"));
//		alunos.add(new Aluno("Thiago"));
//		alunos.add(new Aluno("Tiago"));

		for (int i = 0; i < alunos.size(); i++) {
			String primLetra = String.valueOf(alunos.get(i).nome.toUpperCase().charAt(0));
			for (int j = 0; j < alunos.get(i).nome.length(); j++) {
				String ultimaLetra = String.valueOf(alunos.get(i).nome.charAt(j));
				if(ultimaLetra.equals("o") && primLetra.equals("T")) {
					String nome = (alunos.get(i).nome);
					alunos.removeIf(s -> nome.contains(primLetra));
				}
			}
		}
		alunos.forEach(System.out::println);
	}
}
