package aula2.poo.exercicio5;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Principal extends Pessoa{

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();

		p1.nome = "Lucas";
		p1.dataNascimento = LocalDate.parse("2004-03-20");

		p2.nome = "Luis";
		p2.dataNascimento = LocalDate.parse("2014-02-14");

		JOptionPane.showMessageDialog(null, pessoaMaisVelha(p1, p2));
	}

	public static String pessoaMaisVelha(Pessoa p1, Pessoa p2) {
		String msg = "";
		if (p1.dataNascimento.isBefore(p2.dataNascimento)) {
			msg += "Pessoa mais velha\nNome: " + p1.nome + "\nIdade: " + (LocalDate.now().getYear() - p1.dataNascimento.getYear());
		}else {
			msg += "Pessoa mais velha\nNome: " + p2.nome + "\nIdade: " + (LocalDate.now().getYear() - p2.dataNascimento.getYear());
		}
		return msg;
	}
	
	

}
