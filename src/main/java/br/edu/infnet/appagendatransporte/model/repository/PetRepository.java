package br.edu.infnet.appagendatransporte.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet,Integer>{
	@Query("from Pet p where p.usuario.id= :userid")
	public List<Pet> obterLista(Integer userid);
}
