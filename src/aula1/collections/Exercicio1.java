package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();

	}

	public Exercicio1() {
		List<Integer> listaNumeros = new ArrayList<Integer>();
		for (int i = 0; i <50; i++) {
			int numerosAleatorios = new Random().nextInt(50);
			listaNumeros.add(numerosAleatorios);
		}
		Collections.sort(listaNumeros);
		JOptionPane.showMessageDialog(null, listaNumeros);
	}

}
