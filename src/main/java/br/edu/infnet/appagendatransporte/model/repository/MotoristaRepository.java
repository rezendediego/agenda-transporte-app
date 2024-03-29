package br.edu.infnet.appagendatransporte.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Motorista;

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista,Integer>{
	@Query("from Motorista m where m.usuario.id= :userid")
	public List<Motorista> obterMotoristas(Integer userid);
}
