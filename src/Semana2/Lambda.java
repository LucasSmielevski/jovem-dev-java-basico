package Semana2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda {

	public static void main(String[] args) {
		new Lambda();

	}

	public Lambda() {
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 50; i++) {
//					System.out.println(i);
//				}
//			}
//		};
//		Runnable rLambda = () -> {
//			for (int i = 0; i < 50; i++) {
//				System.out.println(i);
//			}
//		};
//		Thread t = new Thread(rLambda);
//		System.out.println("Iniciando");
//		t.start();
		
		List<String> lista = new ArrayList<String>();
		lista.add("aaaaa1");
		lista.add("aaaaa2");
		lista.add("aaaaa3");
		lista.add("aaaaa4");
		lista.add("aaaaa5");
		
		lista.forEach(System.out::println);
		
		String s1 = null;
		String o = Optional.ofNullable(s1).orElseGet(()-> pegarString());
		System.out.println(o);
		
		System.out.println("Terminando");
		
		lista.removeIf( s ->  s.contains("3"));
		
		lista.forEach(System.out::println);
		
		
		lista.stream().map(s-> s.length()).forEach(System.out::println);

	}
		
	public String pegarString() {
		return "DEF";
	}

}
