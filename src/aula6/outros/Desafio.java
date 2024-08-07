package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula6.outros.enums.TipoEventoEnum;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}
	
	public Desafio() {
		Evento evento1 = new Evento("Futebol",  LocalDateTime.parse("20/03/2004 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), TipoEventoEnum.LAZER);
		Evento evento2 = new Evento("Reunião com Chefe",  LocalDateTime.parse("20/08/2024 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), TipoEventoEnum.PROFISSIONAL);
		Evento evento3 = new Evento("Festa Familia",  LocalDateTime.parse("15/03/2008 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), TipoEventoEnum.SOCIAL);
		Evento evento4 = new Evento("Vôlei",  LocalDateTime.parse("20/10/2024 15:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), TipoEventoEnum.LAZER);
		
		String escolha =(JOptionPane.showInputDialog("Digite o tipo do evento: "
				+ "\n Social "
				+ "\n Lazer "
				+ "\n Profissional "
				+ "\n Outros"));
		
		TipoEventoEnum tp = TipoEventoEnum.valueOf(escolha.toUpperCase());
		
		switch (tp) {
		case LAZER: {
				List<Evento> eventosJaAconteceram = new ArrayList<Evento>();
				if(evento1.tipoEvento.getDescricao().equals(TipoEventoEnum.LAZER.getDescricao())) {
					Boolean jaAconteceu = evento1.dataHora.isBefore(LocalDateTime.now());
					if (jaAconteceu == true) {
						eventosJaAconteceram.add(evento1);
					}
				}
				System.out.println("Eventos que já aconteceram " + eventosJaAconteceram);
			}
			break;
		case PROFISSIONAL:
			
			break;
		case SOCIAL:
			
			break;
		case OUTROS:
			
			break;

		default:
			break;
		}
	}

}
