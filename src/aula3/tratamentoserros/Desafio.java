package aula3.tratamentoserros;

import javax.swing.JOptionPane;

import aula3.tratamentoserros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}
	
	public Desafio() throws VendaException {
		Venda venda = new Venda();
		venda.nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens: "));
		try {
			if (quantidade>1 || quantidade<=10) {
				System.out.println(quantidade);
			}
		} catch (VendaException e) {
			throw new VendaException("Quantiade tem que ser maior que zero e menor que 11");
		}
		
//		venda.itens = 
	}

}
