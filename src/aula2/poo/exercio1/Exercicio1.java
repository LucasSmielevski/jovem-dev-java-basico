package aula2.poo.exercio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		new Exercicio1();
	}

	public Exercicio1() {
		String n = (JOptionPane.showInputDialog("Digite o número: "));
		n = n.replaceAll(",", ".");
		double numero = Double.parseDouble(n);
		int numeroInteiro = (int) numero;
		JOptionPane.showMessageDialog(null, "O número digitado sem vírgula: " + numeroInteiro);
	}

}
