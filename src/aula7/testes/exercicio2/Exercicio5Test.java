package aula7.testes.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;
import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {
	
	private List<String> nomes;
	private static Exercicio5 exercicio;
	
	@BeforeAll
	static void init() {
		exercicio = new Exercicio5();
	}
	
	@BeforeEach
	void setup() {
		nomes = new ArrayList<String>();
	}

	@DisplayName("Se houver mais de um nome terminado em Berto , retornar o primeiro nome")
	@Test
	void deveRetornarPrimeiroNomeTerminadoEmBerto() {
		nomes.add("Lucas");
		nomes.add("Amanda");
		nomes.add("Alberto");
		nomes.add("Adalberto");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	
	@DisplayName("Se houver um nome terminado em Berto , retornar o nome")
	@Test
	void deveRetornarONomeTerminadoEmBerto() {
		nomes.add("Lucas");
		nomes.add("Amanda");
		nomes.add("Alberto");
		nomes.add("Luis");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	
	//Lista vazia
	@DisplayName("Se a lista estiver vazia , deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoListaVazia() {


		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes));
	}
	//Lista com elemento nulo
	@DisplayName("Se houver um elemento nulo e houver um berto , deve trazer o berto")
	@Test
	void deveTrazerNomeComElementoNulo() {
		nomes.add(null);
		nomes.add("Alberto");
		nomes.add("Adalberto");
		nomes.add("Amanda");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	//List sem berto
	@DisplayName("Se não houver um berto na lista , deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeNaoHouverBerto() {
		nomes.add("Lucas");
		nomes.add("Rogerio");
		nomes.add("Amanda");
		
		Exercicio5 exercicio = new Exercicio5();
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes));

	}

}
