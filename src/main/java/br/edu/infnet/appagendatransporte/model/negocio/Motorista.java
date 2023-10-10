package br.edu.infnet.appagendatransporte.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TMotorista")
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float qualificacaoMotorista;
	private String cpf;
	private String nomeMotorista;
	private String celularMotorista;
	private String tipoCarro;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Motorista() {

	}

	public Motorista(float qualificacaoMotorista, String cpf, String nomeMotorista, String celularMotorista,
			String tipoCarro) {
		this.qualificacaoMotorista = qualificacaoMotorista;
		this.cpf = cpf;
		this.nomeMotorista = nomeMotorista;
		this.celularMotorista = celularMotorista;
		this.tipoCarro = tipoCarro;
	}

	@Override
	public String toString() {
		return String.format("Motorista: %d, %.2f, %s, %s, %s, %s", id, qualificacaoMotorista, cpf, nomeMotorista,
				celularMotorista, tipoCarro);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getQualificacaoMotorista() {
		return qualificacaoMotorista;
	}

	public void setQualificacaoMotorista(float qualificacaoMotorista) {
		this.qualificacaoMotorista = qualificacaoMotorista;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public String getCelularMotorista() {
		return celularMotorista;
	}

	public void setCelularMotorista(String celularMotorista) {
		this.celularMotorista = celularMotorista;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
