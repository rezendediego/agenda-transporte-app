package br.edu.infnet.appagendatransporte.model.negocio;

import org.springframework.stereotype.Controller;

@Controller
public class Usuario {
	private Integer id;
	private String nomeUsuario;
	private String email;
	private String senha;

	public Usuario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return String.format("Usuario: %d, %s, %s, %s", id, nomeUsuario, email, senha);
	}

}
