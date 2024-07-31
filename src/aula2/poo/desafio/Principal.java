package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Carro> carros = new ArrayList<>();

		while (true) {
			String modelo = JOptionPane.showInputDialog("Digite o modelo do carro (ou 'fim' para encerrar):");
			if (modelo.equalsIgnoreCase("fim")) {
				break;
			}

			String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
			int ano;
			ano = Integer.parseInt(anoStr);

			carros.add(new Carro(modelo, ano));
		}

		Collections.sort(carros, new Comparator<Carro>() {
			@Override
			public int compare(Carro c1, Carro c2) {
				return Integer.compare(c1.ano, c2.ano);
			}
		});
		

		String resultado = "Carros cadastrados (do mais velho ao mais novo):\n";
		for (Carro carro : carros) {
			resultado += "Modelo: " + carro.modelo + ", Ano: " + carro.ano + "\n";
		}

		JOptionPane.showMessageDialog(null, resultado);
	}

}
