package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	String telefone;
	LocalDate dataNascimento;
	
	public Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
	
}

