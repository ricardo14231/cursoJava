package com.classes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.tabelas.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{

}
