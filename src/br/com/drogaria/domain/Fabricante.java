package br.com.drogaria.domain;

public class Fabricante {
	private Long Codigo;
	private String descricao;

	public Long getCodigo() {
		return Codigo;
	}

	public void setCodigo(Long codigo) {
		Codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		String saida = Codigo + " - " + descricao;
		return saida;
	}
}
