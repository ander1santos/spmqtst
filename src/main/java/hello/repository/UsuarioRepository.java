package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
