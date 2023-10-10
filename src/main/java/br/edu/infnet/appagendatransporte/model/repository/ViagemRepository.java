package br.edu.infnet.appagendatransporte.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Viagem;

@Repository
public interface ViagemRepository extends CrudRepository<Viagem,Integer>{
	@Query("from Viagem v where v.usuario.id= :userid")
	public List<Viagem> obterLista(Integer userid);
}
