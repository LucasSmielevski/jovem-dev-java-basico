package aula2.poo.exercicio8;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		Automovel carro = new Automovel();
		
		carro.nome = "Audi";
		carro.cor = "Azul";
		carro.velocidade = 100;
		
		carro.acelerar();
	}

}
