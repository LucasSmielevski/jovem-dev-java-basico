package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}
	
	public Exercicio3() {
		 String data = JOptionPane.showInputDialog("Digite uma data no formato dd/MM/yyyy");
		 LocalDate dataFormatada = LocalDate.parse(data,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 DayOfWeek dia = DayOfWeek.from(dataFormatada);
		 JOptionPane.showMessageDialog(null, "O dia da semana em que essa data caiu foi: " + dia);
	}

}
