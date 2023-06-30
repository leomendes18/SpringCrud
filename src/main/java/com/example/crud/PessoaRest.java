package com.example.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.database.RepositorioPessoa;
import com.example.crud.entidade.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaRest {
  @Autowired
  private RepositorioPessoa repositorio;

  @GetMapping
  public List<Pessoa> listar(){
    return repositorio.findAll();
  }

  @PostMapping
  public void salvar(@RequestBody Pessoa pessoa){
    repositorio.save(pessoa);
  }

  @PutMapping
  public void alterar(@RequestBody Pessoa pessoa){
    if(pessoa.getId() > 0){
      repositorio.save(pessoa);
    }
  }

  @DeleteMapping
  public void excluir(@RequestBody Pessoa pessoa){
    repositorio.delete(pessoa);
  }
}
