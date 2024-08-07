package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import aula6.outros.enums.TipoEventoEnum;

public class Evento {
	public String descricao;
	public LocalDateTime dataHora;
	public TipoEventoEnum tipoEvento;
	
	public Evento(String descricao, LocalDateTime dataHora, TipoEventoEnum tipoEvento) {
		super();
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoEvento = tipoEvento;
	}

	@Override
	public String toString() {
		return "Evento : "
				+ "\ndescricao= " + descricao + ", data e Hora= " + dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + ", tipoEvento= " + tipoEvento.getDescricao() + "";
	}
	
	
	
	
}
