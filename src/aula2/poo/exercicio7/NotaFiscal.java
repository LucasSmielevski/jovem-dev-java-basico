package aula2.poo.exercicio7;

public class NotaFiscal {
	String emitente;
	private double valor;

	public void calculaValor(double precoBruto, double desconto) {
		valor = precoBruto - desconto;
	}

	public double valor() {
		return valor;
	}
}
