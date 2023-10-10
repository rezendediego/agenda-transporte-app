package br.edu.infnet.appagendatransporte.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendatransporte.model.negocio.Motorista;
import br.edu.infnet.appagendatransporte.model.repository.MotoristaRepository;

@Service
public class MotoristaService {
	@Autowired
	private MotoristaRepository motoristaRepository;

	public Collection<Motorista> obterMotoristas() {
		return (Collection<Motorista>) motoristaRepository.findAll();
	}

	public void incluir(Motorista motorista) {
		motoristaRepository.save(motorista);
	}

	public void excluir(Integer id) {
		motoristaRepository.deleteById(id);
	}
}
