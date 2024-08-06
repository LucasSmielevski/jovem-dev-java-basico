package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {
	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Ana", "1234-5678", LocalDate.parse("1990-05-15")));
        pessoas.add(new Pessoa("Bruno", "2345-6789", LocalDate.parse("1985-06-20")));
        pessoas.add(new Pessoa("Carlos", "3456-7890", LocalDate.parse("1978-05-05")));
        pessoas.add(new Pessoa("Daniela", "4567-8901", LocalDate.parse("1992-08-10")));
        pessoas.add(new Pessoa("Eduardo", "5678-9012", LocalDate.parse("2000-05-25")));
        pessoas.add(new Pessoa("Fernanda", "6789-0123", LocalDate.parse("1983-12-30")));
        pessoas.add(new Pessoa("Gabriel", "7890-1234", LocalDate.parse("1995-03-17")));
        pessoas.add(new Pessoa("Amanda", "8901-2345", LocalDate.parse("1997-05-09")));
        pessoas.add(new Pessoa("Igor", "9012-3456", LocalDate.parse("2001-11-21")));
        pessoas.add(new Pessoa("Juliana", "0123-4567", LocalDate.parse("1989-07-07")));


		List<Pessoa> nascidosEmMaio = pessoas.stream()
                .filter(pessoa -> pessoa.dataNascimento.getMonthValue() == 5)
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .collect(Collectors.toList());

        nascidosEmMaio.forEach(System.out::println);	
        }
}
