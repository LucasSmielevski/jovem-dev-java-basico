package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();

	}

	public Exercicio2(){
		List<Integer> listaNumeros = new ArrayList<Integer>();
		for (int i = 0; i <50; i++) {
			int numerosAleatorios = new Random().nextInt(100);
			listaNumeros.add(numerosAleatorios);
		}
		Collections.sort(listaNumeros);
		Collections.reverse(listaNumeros);
		JOptionPane.showMessageDialog(null, listaNumeros);
	}
}
