package br.edu.infnet.appagendatransporte.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendatransporte.model.negocio.Delivery;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.repository.DeliveryRepository;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryRepository deliveryRepository;

	public Collection<Delivery> obterLista() {
		return  (Collection<Delivery>) deliveryRepository.findAll();
	}

	public Collection<Delivery> obterLista(Usuario usuario) {
		return (Collection<Delivery>) deliveryRepository.obterLista(usuario.getId());
	}
	public void incluir(Delivery delivery) {
		deliveryRepository.save(delivery);
	}

	public void excluir(Integer id) {
		deliveryRepository.deleteById(id);
	}
}
