package avaliacao.semana1;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	Cliente cliente;
	ItemVenda itensvendas;
	public Venda(Cliente cliente, ItemVenda itensvendas) {
		super();
		this.cliente = cliente;
		this.itensvendas = itensvendas;
	}
	
	@Override
	public String toString() {
		return cliente +"\n" + itensvendas;
	}
	
}


