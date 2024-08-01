package aula3.tratamentoserros;

import javax.swing.JOptionPane;

import aula3.tratamentoserros.exceptions.PrecoIncorretoException;
import aula3.tratamentoserros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		Venda venda = new Venda();
		venda.nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		JOptionPane.showMessageDialog(null, adicionarItens(venda));
	}

	public static String adicionarItens(Venda venda) {
		String msg = "";
		int quantidade = 0;
		try {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens: "));

			if (quantidade < 1 || quantidade > 10) {
				throw new VendaException("A quantidade de itens deve ser entre 1 e 10");
			}
			for (int i = 0; i < quantidade; i++) {
				String nomeItem = JOptionPane.showInputDialog("Digite o nome do item " + (i + 1));
				double precoItem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item " + (i + 1)));
				try {
					if (precoItem <= 0) {
						throw new PrecoIncorretoException("O preço do item não pode ser menor que 1.");
					} else {
						Item item = new Item(nomeItem, precoItem);
						venda.itens.add(item);
					}
				} catch (PrecoIncorretoException e) {
					JOptionPane.showMessageDialog(null, "Erro no preço do item: " + e.getMessage(), "error", 0);
					return adicionarItens(venda);
				} catch (NullPointerException | NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente");
					return adicionarItens(venda);
				}
			}
			msg += "Venda criada com sucesso para o cliente " + venda.nomeCliente + " com " + venda.itens.size()
					+ " itens";

		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "Erro na venda: " + e.getMessage(), "error", 0);
		} catch (NumberFormatException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente");
			return adicionarItens(venda);
		}
		return msg;

	}
}
