package avaliacao.semana1;

public class Produto {
	String nomeProduto;
	double precoUnidade;
	int quantidade;

	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return nomeProduto + "\n" + quantidade +"x"+ " " + precoUnidade + " ............ " + (precoUnidade*quantidade);
	}
}
