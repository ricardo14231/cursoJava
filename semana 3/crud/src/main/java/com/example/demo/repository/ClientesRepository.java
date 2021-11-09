package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ClientesModel;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesModel, Long>{

	@Query(value = "SELECT * FROM clientes_model u WHERE u.tipo = :tipo",
			nativeQuery = true)
	List<ClientesModel> procuraTipoCliente(Integer tipo);
	
	@Query(value = "SELECT * FROM clientes_model",
			nativeQuery = true)
	List<ClientesModel> procuraTodos();
	
	@Query(value = "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo ", nativeQuery = true)
	List<ClientesModel> procuraPessoasFísicas(Integer tipo);
		
	@Query(value = "SELECT * FROM CLIENTE_MODEL c ORDER BY c.nome ", nativeQuery = true)
	List<ClientesModel> procuraTodosAlfabetico();
}
