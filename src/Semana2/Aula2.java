package Semana2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Aula2 {

	public static void main(String[] args) {
		new Aula2();

	}
	
	public Aula2() {
//		//casting
//		double d1 = 5;
//		//5.0
//		System.out.println(d1);
//		int i1 = (int) d1;
//		System.out.println(i1);
//		
		//operaçao com string
//		String s1 = "abc";
//		String s2 = "ABC";//		System.out.println(Objects.equals(s1, s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.contains("ab"));
		
		//operações com datas
//		LocalDate ld = LocalDate.now();
//		LocalDate ldl = LocalDate.of(1984,6,20);
//		LocalDate ld2 = LocalDate.parse("1990-11-09");
//		LocalDate ld3 = LocalDate.parse("20/03/2004",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ld.plusDays(300));
//		System.out.println(ldl);
//		System.out.println(ld2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//		System.out.println(ld3);
//		System.out.println(ldt);
		
		Cachorro c = new Cachorro();
		c.andar();
		CachorroSalsicha cs = new CachorroSalsicha();
		cs.fazerBarulho();
		
	}

}
