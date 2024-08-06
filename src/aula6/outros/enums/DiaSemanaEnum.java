package aula6.outros.enums;

public enum DiaSemanaEnum {
	SEGUNDA_FEIRA("segunda-feira") {
		@Override
		public String isFimDeSemana(String nome) {
			return "Não é Fim de Semana";
		}
	},
	TERÇA_FEIRA("terça-feira") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "Não é Fim de Semana";
		}
	},
	QUARTA_FEIRA("quarta-feira") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "Não é Fim de Semana";
		}
	},
	QUINTA_FEIRA("quinta-feira") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "Não é Fim de Semana";
		}
	},
	SEXTA_FEIRA("sexta-feira") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "É Fim de Semana";
		}
	},
	SABADO("sábado") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "É Fim de Semana";
		}
	},
	DOMINGO("domingo") {
		@Override
		public String isFimDeSemana(String nome) {
			// TODO Auto-generated method stub
			return "É Fim de Semana";
		}
	};
	
	private String nome;
	public abstract String isFimDeSemana(String nome);
	
	private DiaSemanaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
