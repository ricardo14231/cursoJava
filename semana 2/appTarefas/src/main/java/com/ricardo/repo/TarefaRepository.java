package com.ricardo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.model.TarefaModel;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {

}
