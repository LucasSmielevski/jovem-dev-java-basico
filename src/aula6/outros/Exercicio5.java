package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

	}

	public BigDecimal calcularValorDoRaio() {
		int circuferencia = 33;
		BigDecimal raio = new BigDecimal(circuferencia / (2 * Math.PI));
		return raio.setScale(4, RoundingMode.HALF_EVEN);
	}

}
