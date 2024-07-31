package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		String frase1 = JOptionPane.showInputDialog("Digite uma frase");
		String frase2 = JOptionPane.showInputDialog("Digite outra frase");

		if (frase1.equals(frase2)) {
			JOptionPane.showMessageDialog(null, "As duas frase são iguais" + "\nQuantidade de caracteres da frase 1: "
					+ frase1.length() + "\nQuantidade de caracteres da frase 2: " + frase2.length());
		}else{
			JOptionPane.showMessageDialog(null, "As duas frases não são iguais" + "\nQuantidade de caracteres da frase 1: "
					+ frase1.length() + "\nQuantidade de caracteres da frase 2: " + frase2.length());
		}
	}

}
