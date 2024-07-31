package Semana2;

import javax.swing.JOptionPane;

public class Exececao {

	public static void main(String[] args) {
		new Exececao();
	}

	public Exececao() {
		try {
			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			System.out.println(d);
		} catch (NumberFormatException | NullPointerException e) {
			System.err.println("O valor digitado é inválido");
			e.printStackTrace();
		}
		System.out.println("Terminando um problema");

		try {
			Double d = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
			if (d < 0) {
				throw new IllegalArgumentException("Nota menor que 0");
			}
			System.out.println(d);
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println("Digite um valor válido");
		}

	}
}
