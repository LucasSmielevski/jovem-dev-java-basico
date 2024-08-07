package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		int circuferencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da circuferência do círculo"));
		BigDecimal raio = new BigDecimal( circuferencia/ (2*Math.PI));
		JOptionPane.showMessageDialog(null, "Resultado: " + raio.setScale(4, RoundingMode.HALF_EVEN));

	}

}
