package aula6.outros;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import javax.swing.JOptionPane;

import aula6.outros.enums.TipoEventoEnum;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		List<Evento> eventos = new ArrayList<>();

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
//
//		String escolha = (JOptionPane.showInputDialog(
//				"Digite o tipo do evento: " 
//				+ "\n Social " 
//				+ "\n Lazer " 
//				+ "\n Profissional " 
//				+ "\n Outros").toUpperCase());
//		
//		TipoEventoEnum tipoEvento;
//
//		try {
//			tipoEvento = TipoEventoEnum.valueOf(escolha);
//		} catch (IllegalArgumentException e) {
//			JOptionPane.showMessageDialog(null, "Tipo de evento inválido.");
//			return;
//		}
//
//		List<Evento> eventosJaOcorridos = eventos.stream()
//				.filter(e -> e.tipoEvento == tipoEvento && e.dataHora.isBefore(LocalDateTime.now()))
//				.collect(Collectors.toList());
//
//		List<Evento> eventosFuturos = eventos.stream()
//				.filter(e -> e.tipoEvento == tipoEvento && e.dataHora.isAfter(LocalDateTime.now()))
//				.collect(Collectors.toList());
//
//		StringBuilder resultado = new StringBuilder("Eventos do tipo " + tipoEvento + ":\n\n");
//
//		resultado.append("Já ocorreram\n");
//		for (Evento evento : eventosJaOcorridos) {
//			resultado.append(evento).append("\n");
//		}
//
//		resultado.append("\nAinda vão ocorrer\n");
//		for (Evento evento : eventosFuturos) {
//			resultado.append(evento).append("\n");
//		}
//
//		JOptionPane.showMessageDialog(null, resultado.toString());
	}
	
	public List<Evento> filtrarEventosPorTipo(List<Evento> eventos, TipoEventoEnum tipoEvento) {
        return eventos.stream()
                .filter(e -> e.tipoEvento == tipoEvento)
                .collect(Collectors.toList());
    }

    public  List<Evento> obterEventosJaOcorridos(List<Evento> eventos) {
        return eventos.stream()
                .filter(e -> e.dataHora.isBefore(LocalDateTime.now()))
                .collect(Collectors.toList());
    }

    public  List<Evento> obterEventosFuturos(List<Evento> eventos) {
        return eventos.stream()
                .filter(e -> e.dataHora.isAfter(LocalDateTime.now()))
                .collect(Collectors.toList());
    }

}
