package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

import javax.swing.JOptionPane;

import aula5.stream.Pessoa;

public class Exercicio4 {

	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa:");
		String telefone1 = JOptionPane.showInputDialog("Digite o telefone da primeira pessoa:");
		LocalDate dataNascimento1 = null;
		String dataNascimento1Str = JOptionPane
				.showInputDialog("Digite a data de nascimento da primeira pessoa (dd/MM/yyyy):");
		dataNascimento1 = LocalDate.parse(dataNascimento1Str, formatter);

		Pessoa pessoa1 = new Pessoa(nome1, telefone1, dataNascimento1);

		String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa:");
		String telefone2 = JOptionPane.showInputDialog("Digite o telefone da segunda pessoa:");
		LocalDate dataNascimento2 = null;
		String dataNascimento2Str = JOptionPane
				.showInputDialog("Digite a data de nascimento da segunda pessoa (dd/MM/yyyy):");
		dataNascimento2 = LocalDate.parse(dataNascimento2Str, formatter);

		Pessoa pessoa2 = new Pessoa(nome2, telefone2, dataNascimento2);
																									//operador ternário em Java: declaração if-else
        Pessoa pessoaMaisVelha = pessoa1.getDataNascimento().isBefore(pessoa2.getDataNascimento()) ? pessoa1 : pessoa2;

        StringBuilder sb = new  StringBuilder();
        sb.append("Nome da pessoa mais velha: ")
        .append(pessoaMaisVelha.getNome())
        .append("\nNúmero de telefone: ")
        .append(pessoaMaisVelha.getTelefone())
        .append("\nData de nascimento: ")
        .append(pessoaMaisVelha.getDataNascimento().format(formatter));
        System.out.println(sb.toString());
	} 

}
