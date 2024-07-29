package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		new Exercicio5();
	}
	
	public Exercicio5() {
		Set<Integer> conjunto = new HashSet<Integer>();
		Set<Integer> conjunto2 = new HashSet<Integer>();
		List<Integer> iguais = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			int numerosAleatorios = new Random().nextInt(31);
			int numerosAleatorios2 = new Random().nextInt(31);
			conjunto.add(numerosAleatorios);
			conjunto2.add(numerosAleatorios2);
		}
		for (Integer conjuntoUM : conjunto) {
			for (Integer conjuntoDois : conjunto2) {
				if (conjuntoUM.equals(conjuntoDois)) {
					iguais.add(conjuntoDois);
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Conjunto 1: " + conjunto + "\nConjunto 2: " + conjunto2 + "\nIntersecção: " + iguais );
	}
	

}
