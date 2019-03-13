package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.model.Conta;

public interface ContaRepository extends CrudRepository<Conta, Integer> {

}
