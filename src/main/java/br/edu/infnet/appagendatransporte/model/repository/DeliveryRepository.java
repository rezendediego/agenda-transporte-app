package br.edu.infnet.appagendatransporte.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Delivery;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery,Integer>{
	@Query("from Delivery d where d.usuario.id= :userid")
	public List<Delivery> obterLista(Integer userid);
}
