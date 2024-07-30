package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Pessoa p1 = new Pessoa();
		PessoaFisica pf = new PessoaFisica();

		p1.nome = "Lucas";
		p1.dataNascimento = LocalDate.parse("2004-02-18");

		pf.nome = "Gabriel";
		pf.dataNascimento = LocalDate.parse("2014-05-28");
		pf.cpf = "057.451.325.45";

		if (p1.dataNascimento.isAfter(pf.dataNascimento)) {
			JOptionPane.showMessageDialog(null, "Pessoa mais nova\nNome: " + p1.nome + "\nData Nascimento: "
					+ p1.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		} else {
			JOptionPane.showMessageDialog(null, "Pessoa mais nova\nNome: " + pf.nome + "\nData Nascimento: "
					+ pf.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nCPF: " + pf.cpf);
		}
	}

}
