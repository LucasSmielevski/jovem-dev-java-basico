package aula2.poo.exercicio5;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	LocalDate dataNascimento;
	
	//NO EXERCICIO NÃO ESPECIFICAVA EM QUAL CLASSE O MÉTODO TINHA QUE SER FEITO , CASO PRECISSE SER NESSE , ESTÁ COMENTADO ABAIXO
//	public static String pessoaMaisVelha(Pessoa pessoa1, Pessoa pessoa2) {
//		String msg = "";
//		if (pessoa1.dataNascimento.isBefore(pessoa2.dataNascimento)) {
//			msg += "Pessoa mais velha\nNome: " + pessoa1.nome + "\nIdade: " + (LocalDate.now().getYear() - pessoa1.dataNascimento.getYear());
//		}else {
//			msg += "Pessoa mais velha\nNome: " + pessoa2.nome + "\nIdade: " + (LocalDate.now().getYear() - pessoa2.dataNascimento.getYear());
//		}
//		return msg;
//	}
}
