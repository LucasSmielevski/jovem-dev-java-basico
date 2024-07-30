package aula2.poo.exercicio4;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		carro1.modelo = "Ferrari";
		carro1.ano = LocalDate.parse("2024-07-25").getYear();
		carro1.cor = "Vermelha";

		carro2.modelo = "Audi";
		carro2.ano = LocalDate.parse("2023-07-25").getYear();
		carro2.cor = "Preta";

		carro3.modelo = "Fusca";
		carro3.ano = LocalDate.parse("1990-03-25").getYear();
		carro3.cor = "Azul";

		JOptionPane.showMessageDialog(null,
				"Carro 1\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano + "\nCor: " + carro1.cor
						+ "\n\nCarro 2\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano + "\nCor: " + carro2.cor
						+ "\n\nCarro 3\nModelo: " + carro3.modelo + "\nAno: " + carro3.ano + "\nCor: " + carro3.cor);
	}

}
