package br.edu.infnet.appagendatransporte.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendatransporte.model.negocio.Pet;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.repository.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;

	public Collection<Pet> obterLista() {
		return  (Collection<Pet>) petRepository.findAll();
	}

	public Collection<Pet> obterLista(Usuario usuario) {
		return (Collection<Pet>) petRepository.obterLista(usuario.getId());
	}
	public void incluir(Pet pet) {
		petRepository.save(pet);
	}

	public void excluir(Integer id) {
		petRepository.deleteById(id);
	}
}
