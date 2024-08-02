package avaliacao.semana1;

import java.util.ArrayList;
import java.util.List;

public class ItemVenda {
	List<Produto> produtos = new ArrayList<Produto>();

	public ItemVenda(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return produtos.toString();
	}
}
