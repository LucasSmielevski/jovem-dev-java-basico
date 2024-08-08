package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;
import aula6.outros.Desafio;
import aula6.outros.Evento;
import aula6.outros.enums.TipoEventoEnum;

class Desafio6Test {

	 private List<Evento> eventos;

	 private static Desafio desafio;
		
		@BeforeAll
		static void init() {
			desafio = new Desafio();
		}
	 
	    @BeforeEach
	    void setup() {
	        eventos = new ArrayList<>();
	        eventos.add(new Evento("Futebol",
					LocalDateTime.parse("20/03/2004 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
					TipoEventoEnum.LAZER));
			eventos.add(new Evento("Reunião com Chefe",
					LocalDateTime.parse("20/08/2024 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
					TipoEventoEnum.PROFISSIONAL));
			eventos.add(new Evento("Festa Familia",
					LocalDateTime.parse("15/03/2008 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
					TipoEventoEnum.SOCIAL));
			eventos.add(new Evento("Vôlei",
					LocalDateTime.parse("20/10/2024 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
					TipoEventoEnum.LAZER));
	    }

	    @DisplayName("Deve retornar um IllegalArgumentException se tiver um tipo invalido de evento")
	    @Test
	    void testEventoInvalido() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            TipoEventoEnum tipoInvalido = TipoEventoEnum.valueOf("INEXISTENTE");
	        });
	    }
	    
	    @DisplayName("Deve retornar uma lista vazia quando não houver eventos do tipo especificado.")
	    @Test
	    void testEventoNaoExistenteNaLista() {
	        TipoEventoEnum tipoEventoNaoExistente = TipoEventoEnum.OUTROS;
	        List<Evento> resultado = desafio.filtrarEventosPorTipo(eventos, tipoEventoNaoExistente);
	        assertTrue(resultado.isEmpty());
	    }

	    @DisplayName("Deve retornar exatamente 2 eventos do tipo LAZER.")
	    @Test
	    void testRetornandoApenasEventosDeUmaCategoria() {
	        TipoEventoEnum tipoProfissional = TipoEventoEnum.LAZER;
	        List<Evento> eventosProfissionais = desafio.filtrarEventosPorTipo(eventos, tipoProfissional);
	        assertEquals(2, eventosProfissionais.size());
	    }

	    @DisplayName("Deve haver eventos futuros e já ocorridos.")
	    @Test
	    void testRetornandoEventosDeAmbasAsCategorias() {
	        TipoEventoEnum tipoLazer = TipoEventoEnum.LAZER;
	        List<Evento> eventosLazer = desafio.filtrarEventosPorTipo(eventos, tipoLazer);

	        List<Evento> eventosFuturos = desafio.obterEventosFuturos(eventosLazer);
	        List<Evento> eventosJaOcorridos = desafio.obterEventosJaOcorridos(eventosLazer);

	        assertTrue(eventosFuturos.size() > 0);
	        assertTrue(eventosJaOcorridos.size() > 0);
	    }

}
