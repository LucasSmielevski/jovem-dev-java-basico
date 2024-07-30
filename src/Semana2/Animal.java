package Semana2;

public abstract class Animal {

	public int tamanho;
	public String nome;
	
	protected void metodoProtected() {
		
	}
	
	public void andar() {
		System.out.println("O animal andou");
	}
	
	public abstract void fazerBarulho();
}
