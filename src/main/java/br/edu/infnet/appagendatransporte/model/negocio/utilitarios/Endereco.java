package br.edu.infnet.appagendatransporte.model.negocio.utilitarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEndereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	String nomeRua;
	Integer numeroResidencia;
	String cep;

	public Endereco() {

	}

	public Endereco(String nomeRua, Integer numeroResidencia, String cep) {
		this.nomeRua = nomeRua;
		this.numeroResidencia = numeroResidencia;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return String.format("Endereço: %s, %d, %s", nomeRua, numeroResidencia, cep);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public Integer getNumeroResidencia() {
		return numeroResidencia;
	}

	public void setNumeroResidencia(Integer numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}