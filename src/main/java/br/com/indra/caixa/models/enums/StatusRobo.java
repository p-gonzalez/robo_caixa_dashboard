package br.com.indra.caixa.models.enums;

public enum StatusRobo {
	ATIVO(1, "Ativo"), INATIVO(2, "iNATIVO");

	private int cod;
	private String descricao;
	
	private StatusRobo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static StatusRobo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		return null;
		
	}
	
	
	
}
