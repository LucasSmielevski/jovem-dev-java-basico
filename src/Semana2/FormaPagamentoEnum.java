package Semana2;

import java.util.function.Function;

public enum FormaPagamentoEnum {
	CARTAO_DEBITO(2,"Cartão de débito", vb -> vb) ,
	CARTAO_CREDITO(1, "Cartão de crédito", vb -> vb) , 
	DINHEIRO(3, "Dinheiro" ,vb -> vb *0.8),
	PIX(17, "PIX",  vb -> vb *0.9);
	
	private int codigo;
	private String descricao;
	private Function<Double, Double> desconto;
	
	private FormaPagamentoEnum(int codigo , String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Function<Double, Double> getDesconto() {
		return desconto;
	}
	
	
	
}
