package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		new Exercicio6();
	}

	public Exercicio6() {
		Map<String, double[]> alunos = new HashMap<String, double[]>();
		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno: " + (i + 1));
			double[] notas = new double[3];
			for (int j = 0; j < 3; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite as notas do aluno " + nome));
				notas[j] = nota;
			}
			alunos.put(nome, notas);
		}
		for (Map.Entry<String, double[]> entry : alunos.entrySet()) {
			String nome = entry.getKey();
			double[] notas = entry.getValue();
			double soma = 0;
			String msg = "Notas do Aluno: " + nome;

			for (double nota : notas) {
				soma+= nota;
				msg += "\nNota: " + nota;
			}
			double media = soma/notas.length;
			String resultado = String.format("%.1f", media);
			JOptionPane.showMessageDialog(null, msg + "\nMédia: " + resultado);
		}
	}
}
