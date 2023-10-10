package br.edu.infnet.appagendatransporte.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
//	Usuario findEmail(String email);
}
