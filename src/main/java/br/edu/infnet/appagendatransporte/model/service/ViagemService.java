package br.edu.infnet.appagendatransporte.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.negocio.Viagem;
import br.edu.infnet.appagendatransporte.model.repository.ViagemRepository;

@Service
public class ViagemService {
	@Autowired
	private ViagemRepository viagemRepository;

	public Collection<Viagem> obterLista() {
		return  (Collection<Viagem>) viagemRepository.findAll();
	}

	public Collection<Viagem> obterLista(Usuario usuario) {
		return (Collection<Viagem>) viagemRepository.obterLista(usuario.getId());
	}
	public void incluir(Viagem viagem) {
		viagemRepository.save(viagem);
	}

	public void excluir(Integer id) {
		viagemRepository.deleteById(id);
	}
}
