package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		String frase = JOptionPane.showInputDialog("Digite uma frase:").toLowerCase();
		Map<Character, Integer> contagemCaracteres = new HashMap<>();

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (contagemCaracteres.containsKey(letra)) {
				contagemCaracteres.put(letra, contagemCaracteres.get(letra) + 1);
			} else {
				contagemCaracteres.put(letra, 1);
			}
		}

		String resultado = "Resultado:\n";
		for (Map.Entry<Character, Integer> entry : contagemCaracteres.entrySet()) {
			resultado += entry.getKey() + " - " + entry.getValue() + ", ";
		}

		JOptionPane.showMessageDialog(null, resultado, "Contagem de Caracteres", JOptionPane.INFORMATION_MESSAGE);
	}
}
