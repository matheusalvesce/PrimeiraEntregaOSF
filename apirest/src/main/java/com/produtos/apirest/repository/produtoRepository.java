package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<Produto, Long>{
    
}
