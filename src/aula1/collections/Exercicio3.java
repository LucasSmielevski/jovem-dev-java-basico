package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();

	}

	public Exercicio3() {
		List<Integer> listaNumeros = new ArrayList<Integer>();
		Set<Integer> numerosSemRepeticao = new HashSet<Integer>();
		for (int i = 0; i < 50; i++) {
			int numerosAleatorios = new Random().nextInt(21);
			listaNumeros.add(numerosAleatorios);
		}
		numerosSemRepeticao.addAll(listaNumeros);
		JOptionPane.showMessageDialog(null, "Lista dos números: " + listaNumeros + "\nLista sem repetição: " + numerosSemRepeticao);
	}
}
