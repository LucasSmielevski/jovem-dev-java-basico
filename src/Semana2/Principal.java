package Semana2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		new Principal();

	}
	
	public Principal(){
		List<String> lista = new ArrayList<String>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		lista.remove(0);
		//Vai dar erro pois o item subsequente vai para a posição apagada
//		lista.remove(1);
		lista.remove("Elemento 2");
		System.out.println(lista.isEmpty());
		
		// ************ HashSet **********
		System.out.println("\n********** HashSet **********");
		Set<String> conjunto = new java.util.HashSet<String>();
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 3");
		conjunto.add("Elemento 4");
		System.out.println(conjunto.size());
		conjunto.remove("Elemento 3");
		System.out.println(conjunto.size());
		
		//************ Map **********
		System.out.println("\n******** Map ********");
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(20, "João");
		mapa.put(35, "Maria");
		System.out.println(mapa.get(35));
		mapa.put(35, "Claudia");
		System.out.println(mapa.get(35));
		mapa.remove(20);
		mapa.remove(35, "Maria");
		System.out.println(mapa.isEmpty());
	}
	
}
