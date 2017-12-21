package com.harada.estudo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harada.estudo.domain.Categoria;
import com.harada.estudo.repositories.CategoriaRepository;
import com.harada.estudo.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

  @Autowired
  private CategoriaRepository repo;

  public Categoria buscar(Integer id) {
    Categoria obj = repo.findOne(id);
    if (obj == null) {
      throw new ObjectNotFoundException("Objeto não encontrado! Id: "+ id +", Tipo: "+ Categoria.class.getName());
    }
    return obj;
  }
}