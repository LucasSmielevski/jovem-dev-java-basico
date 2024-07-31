package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		NotaFiscal nota1 = new NotaFiscal();
        NotaFiscal nota2 = new NotaFiscal();
        
        nota1.emitente = "Empresa A";
        nota2.emitente = "Empresa B";

        nota1.calculaValor(1000.0, 100.0);  
        nota2.calculaValor(500.0, 50.0);   
        
        JOptionPane.showMessageDialog(null, "Emitente: " + nota1.emitente + ", Valor: R$" + nota1.valor());
        JOptionPane.showMessageDialog(null, "Emitente: " + nota2.emitente + ", Valor: R$" + nota2.valor());
	}

}
