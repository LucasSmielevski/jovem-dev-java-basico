package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
//FALTOU METHOD REFERENCE E MASCARA NO NOME DO CLIENTE FALTOU OS CATCH
public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Cliente cliente = new Cliente();
		ClientePremium clientePremium = new ClientePremium();
		try {
			cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
			cliente.dataNascimento = LocalDate.parse(
					JOptionPane.showInputDialog("Digite a data de nascimento do cliente(dd/MM/yyyy): "),
					DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			if (cliente.nome.equalsIgnoreCase("Thiago")) {
				clientePremium.nome = cliente.nome;
				clientePremium.dataNascimento = cliente.dataNascimento;
			}else {
				clientePremium.nome = cliente.nome;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			double valorTotal = 0;
			double subTotal = 0;
			double desconto = 0;
			String porcent = "";
			List<Produto> produtos = new ArrayList<Produto>();
			int i = 0;
			while (true) {
				Produto produto = new Produto();
				String nomeProduto = JOptionPane
						.showInputDialog("Digite o nome do produto " + (i + 1) + "(Digite fim para sair):");
				if (nomeProduto.equalsIgnoreCase("fim")) {
					break;
				}
				produto.nomeProduto = nomeProduto;
				produto.precoUnidade = Double.parseDouble(
						JOptionPane.showInputDialog("Digite o preço por unidade do produto " + (i + 1) + ":"));
				produto.quantidade = Integer
						.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto " + (i + 1) + ":"));
				i++;
				produtos.add(produto);
				subTotal += produto.precoUnidade * produto.quantidade;
			}
			String formaPag = formaPagamento();

			ItemVenda itensvenda = new ItemVenda(produtos);
			Venda venda = new Venda(cliente, itensvenda);
			if (cliente.dataNascimento.getDayOfMonth() == LocalDate.now().getDayOfMonth()
					&& cliente.dataNascimento.getMonth().equals(LocalDate.now().getMonth())) {
				porcent += "30% Aniversario";
				desconto = subTotal * 30 / 100;
				valorTotal = subTotal - desconto;
			} else if (clientePremium.nome.equalsIgnoreCase("Thiago")) {
				porcent += "20% Cliente premium";
				desconto = subTotal * 20 / 100;
				valorTotal = subTotal - desconto;
			} else if (idade(cliente.dataNascimento.getYear()) > 60) {
				porcent += "10% Terceira Idade";
				desconto = subTotal * 10 / 100;
				valorTotal = subTotal - desconto;
			} else {
				valorTotal = subTotal;
			}
			System.out.println("*********** CUPOM ***********");
			itensvenda.produtos.forEach(System.out::println);
			System.out.println("\nSubTotal" + " ............ " + subTotal + "\nDescto." + porcent + "\n\nTotal"
					+ "............" + valorTotal + "\nForma de pagamento: " + formaPag + "\nCliente: " + cliente.nome);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static String formaPagamento() {
		int escolha = Integer.parseInt(JOptionPane
				.showInputDialog("Qual a forma de pagamento?\n1(Cartão de Crédito)\n2(Cartão de Débito)\n3(Dinheiro)"));
		if (escolha == 1) {
			return "Cartão de Crédito";
		} else if (escolha == 2) {
			return "Cartão de Débito";
		} else if (escolha == 3) {
			return "Dinheiro";
		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			return formaPagamento();
		}

	}

	public static int idade(int ano) {
		int idade = LocalDate.now().getYear() - ano;
		return idade;
	}

}
