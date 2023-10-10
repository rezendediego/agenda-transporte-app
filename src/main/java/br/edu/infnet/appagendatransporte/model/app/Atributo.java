package br.edu.infnet.appagendatransporte.model.app;

public class Atributo {
	private String campo;
	private String tipo;
	private String descricao;

	public Atributo(String campo, String tipo, String descricao) {
		this.campo = campo;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return String.format("Atributo: %s, %s, %s,", campo, tipo, descricao);
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
