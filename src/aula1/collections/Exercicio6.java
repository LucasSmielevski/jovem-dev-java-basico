package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		new Exercicio6();
	}

	public Exercicio6() {
		Map<String, Double> alunos = new HashMap<String, Double>();
		for (int i = 0; i < 2; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno: " + (i+1));
			for (int j = 0; j < 3; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite as notas do aluno: "));
				alunos.put(nome, nota);
			}
		}
		System.out.println(alunos);
	}
}
