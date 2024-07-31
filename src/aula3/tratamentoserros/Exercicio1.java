package aula3.tratamentoserros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}
	
	public Exercicio1() {
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite uma número inteiro: "));
			JOptionPane.showMessageDialog(null, "Número:" + numero);
		} catch (NullPointerException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido", "error", 0);
		}
	}

}
