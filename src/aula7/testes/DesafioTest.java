package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Desafio;
import aula5.stream.Pessoa;

class DesafioTest {
	private List<Pessoa> pessoas;
	private Desafio desafio;
	
	@BeforeEach
	void setup() {
		pessoas = new ArrayList<Pessoa>();
		desafio = new Desafio();
	}
	
	@DisplayName("se tiver pessoa que o nome começa com vogal ou nasceu em ano bissexto, retorna lista com nomes dessas pessoas")
	@Test
	void deveRetornarListaDeNomeDasPessoasQueNasceramEmAnoBissextoOuComeçaComVogal() {
		pessoas.add(new Pessoa("Lucas", LocalDate.parse("2004-05-15")));
		pessoas.add(new Pessoa("Bruno", LocalDate.parse("1985-06-20")));
		pessoas.add(new Pessoa("Carlos", LocalDate.parse("1978-05-05")));
		pessoas.add(new Pessoa("Daniela", LocalDate.parse("1992-08-10")));
		pessoas.add(new Pessoa("Eduardo", LocalDate.parse("2000-05-25")));
		pessoas.add(new Pessoa("Fernanda", LocalDate.parse("1983-12-30")));
		pessoas.add(new Pessoa("Gabriel", LocalDate.parse("1995-03-17")));
		pessoas.add(new Pessoa("Amanda", LocalDate.parse("1997-05-09")));
		pessoas.add(new Pessoa("Igor", LocalDate.parse("2024-11-21")));
		
		List<String> nomesFiltrados = pessoas.stream()
				.filter(pessoa -> começaVogal(pessoa.nome) || Year.isLeap(pessoa.dataNascimento.getYear()))
				.map(Pessoa::getNome).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
		
		List<String> retorno = desafio.nomesQueComecamComVogalOuNasceramEmAnoBissexto(pessoas);
		
		assertEquals(nomesFiltrados, retorno);
	}

	private boolean começaVogal(String nome) {
		char primLetra = Character.toLowerCase(nome.charAt(0));
		return primLetra == 'a' || primLetra == 'e' || primLetra == 'i' || primLetra == 'o' || primLetra == 'u';
	}
	
	@DisplayName("Se a lista estiver vazia ,deve mostrar um lista vazia")
	@Test
	void deveDispararExcecaoListaVazia() {
		
		List<String> nomesFiltrados = pessoas.stream()
				.filter(pessoa -> começaVogal(pessoa.nome) || Year.isLeap(pessoa.dataNascimento.getYear()))
				.map(Pessoa::getNome).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
		
		assertEquals(nomesFiltrados, desafio.nomesQueComecamComVogalOuNasceramEmAnoBissexto(pessoas) );
	}

}
