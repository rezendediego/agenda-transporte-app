package br.edu.infnet.appagendatransporte.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Motorista;

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista,Integer>{

}
