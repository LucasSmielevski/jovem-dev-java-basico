package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		List<String> lista = new ArrayList<String>();
		lista.add("Olá");
		lista.add("hello");
		lista.add("BOM dia");
		lista.add("Boa NOITE");
		lista.add("Jovem Dev");
		
        Mostrador mostrador = new Mostrador() {
			
			@Override
			public void mostra(String mensagem) {
				System.out.println(mensagem.toUpperCase());		
			}
		};
		lista.forEach(mostrador::mostra);
	}
}
