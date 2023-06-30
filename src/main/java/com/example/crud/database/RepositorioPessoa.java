package com.example.crud.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entidade.Pessoa;

public interface RepositorioPessoa extends JpaRepository<Pessoa,Long>{
  
}
