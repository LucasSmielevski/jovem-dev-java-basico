package aula4.lambda;

import java.time.LocalDate;

public class Aluno {
	int numeroChamada;
	String nome;
	LocalDate dataNascimento;
	
	//Apertando CTRL + 3 e digitando gcuf (CRIA CONSTRUTOR AUTOMATICO)
	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		super();
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Aluno( String nome) {
		super();
		this.nome = nome;
	}


	public int getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getprimLetra(String letra) {
		String primLetra = String.valueOf(nome.toUpperCase().charAt(0));
		return primLetra;
	}
	
	
}
