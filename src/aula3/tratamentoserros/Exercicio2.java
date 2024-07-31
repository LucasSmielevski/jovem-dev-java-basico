package aula3.tratamentoserros;

import javax.swing.JOptionPane;

import aula3.tratamentoserros.exceptions.ZeroException;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}
	
	public Exercicio2() {
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
			if(num2!=0) {
				JOptionPane.showMessageDialog(null, "Resultado da divisão: " + num1/num2);
			}else {
				throw new ZeroException();
			}
		} catch (NullPointerException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido , digite novamente");
		}
	}

}
