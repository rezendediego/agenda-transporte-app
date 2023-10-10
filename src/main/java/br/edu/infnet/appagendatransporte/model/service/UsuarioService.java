package br.edu.infnet.appagendatransporte.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

	public Collection<Usuario> obterUsuarios() {	
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		mapaUsuario.put(usuario.getEmail(), usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	
	public Usuario validar(String email, String senha) {
		
//		Usuario user = usuarioRepository.findEmail(email);
		Usuario usuario = mapaUsuario.get(email);
		if (usuario != null) {
			if (senha.equalsIgnoreCase(usuario.getSenha())) {
				return usuario;
			}
		}
		return null;
	}
}
