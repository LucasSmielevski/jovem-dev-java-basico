package aula3.tratamentoserros;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		// ArithmeticException
		try {
			int num1 = 10;
			int num2 = 0;
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		// NullPointerException
		try {
			int[] i = null;
			System.out.println(i.length);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		// StringIndexOutOfBoundsException
		try {
			String frase = "eu cai";
			frase.charAt(7);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// IllegalStateException
	}
}
