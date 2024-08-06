package Semana2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;

public class EnumsEObjects {

	public static void main(String[] args) {
		new EnumsEObjects();
	}

	public EnumsEObjects() {
//		System.out.println(FormaPagamentoEnum.CARTAO_CREDITO.getDescricao());
//		for(FormaPagamentoEnum f : FormaPagamentoEnum.values()) {
//			System.out.println(f.getCodigo() + " - " + f.getDescricao());
//		}
		
//		FormaPagamentoEnum f = FormaPagamentoEnum.PIX;
		
//		switch (f) {
//		case CARTAO_CREDITO:
//			//aplica uma taxa
//			System.out.println(f.getCodigo());
//			break;
//		case DINHEIRO:
//			//aplica desconto
//			System.out.println(f.getCodigo());
//			break;
//		default:
//			System.out.println(f.getCodigo() + "Default");
//		}
		
//		for(FormaPagamentoEnum f : FormaPagamentoEnum.values()) {
//			System.out.println(f.getDesconto().apply(100.0));
//		}
//		
//		String nome = "João";
//		StringBuilder sb = new StringBuilder();
//		sb.append("o nome do usuário é ")
//			.append(nome)
//			.append("e ele tem ")
//			.append(18)		
//			.append(" anos");
//		System.out.println(sb.toString());
		
		BigDecimal b1 = BigDecimal.valueOf(2);
		BigDecimal b2 = BigDecimal.valueOf(3);
		double d = 0.1+0.2;
		System.out.println(b1.divide(b2, 10 , RoundingMode.FLOOR));
		
		
		
	}
}
