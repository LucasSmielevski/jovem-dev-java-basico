package aula6.outros.enums;

public enum TipoEventoEnum {
	SOCIAL(1, "Social"),
	LAZER(2, "Lazer"),
	PROFISSIONAL(3, "Profissional"),
	OUTROS(4, "Outros");
	
	private int codigo;
	private String descricao;
	
	private TipoEventoEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
