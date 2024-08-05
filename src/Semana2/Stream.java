package Semana2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		new Stream();
	}
	
	public Stream() {
//		String s = getString();
//		Optional<String> opt = Optional.ofNullable(s);
//		System.out.println(opt.orElse("Não encontrou"));
//		System.out.println(opt.orElseGet(() -> getStringAlternativo()));
//		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("valor nulo")));
		
		List<String> lista = new ArrayList<String>();
		lista.add("adalberto");
		lista.add("antonio");
		lista.add("claudio");
		lista.add("basilio");
		lista.add("denis");
		lista.add("thiago");
		//OPERAÇÃO INTERMEDIARIA
//		lista.stream().map(String::toUpperCase).forEach(System.out::println);
//		lista.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
		//PODE USAR MAIS DE UMA OPERAÇÃO INTERMEDIÁRIA
//		lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
//		lista.stream().sorted().forEach(System.out::println);
//		lista.stream().limit(3).forEach(System.out::println);
		
		//OPERAÇÃO TERMINAL
//		System.out.println(lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).count());
//		System.out.println(lista.stream().filter(elemento -> elemento.startsWith("x")).map(String::toUpperCase).findFirst().orElse("erro"));
//		System.out.println(lista.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).sum());
//		List<String> nomeFiltrados = lista.stream().filter(elemento -> elemento.startsWith("a")).collect(Collectors.toList());
		Map<Integer, String> nomesFiltrados= lista.stream().filter(elemento -> elemento.startsWith("a")).collect(Collectors.toMap(String::length, s -> s));
		Map<Integer, List<String>> nomeFiltrados= lista.stream().collect(Collectors.groupingBy(String::length));
		String nomesfiltrados= lista.stream().collect(Collectors.joining(", " , "{" , "}"));

		
		System.out.println(lista);
//		System.out.println(nomesFiltrados);
		System.out.println(nomeFiltrados);
//		System.out.println(nomesfiltrados);
		
	}
	
	private String getStringAlternativo() {
		System.out.println("Chamou o metodo alternativo");
		return "String alternativo";
	}
	
	private String getString() {
		if(LocalDateTime.now().getSecond() % 2 ==0) {
			return "Retorno";
		}else {
			return null;
		}
	}
}
