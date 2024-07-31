package aula3.tratamentoserros.exceptions;

public class ZeroException extends IllegalArgumentException{
	public ZeroException() {
		super("O segundo número não pode ser zero.");
	}
}
