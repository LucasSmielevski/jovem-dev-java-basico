package aula4.lambda;

import java.time.LocalDate;

public class Aluno {
	int numeroChamada;
	String nome;
	LocalDate dataNascimento;

	// Apertando CTRL + 3 e digitando gcuf (CRIA CONSTRUTOR AUTOMATICO)
	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		super();
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public int getNumeroChamada() {
		return numeroChamada;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	@Override
	public String toString() {
		return numeroChamada + " " + nome  + " " + dataNascimento;
	}

}
