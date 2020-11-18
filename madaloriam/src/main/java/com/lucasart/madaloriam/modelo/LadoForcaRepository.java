package com.lucasart.madaloriam.modelo;

import org.springframework.data.repository.CrudRepository;

public interface LadoForcaRepository extends CrudRepository<LadoForca,String>{
	public LadoForca findById(long id);
}
