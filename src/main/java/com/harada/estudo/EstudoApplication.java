package com.harada.estudo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harada.estudo.domain.Categoria;
import com.harada.estudo.repositories.CategoriaRepository;

@SpringBootApplication
public class EstudoApplication implements CommandLineRunner {

  @Autowired
  private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}

  @Override
  public void run(String... arg0) throws Exception {
    Categoria cat1 = new Categoria(null, "informatica");
    Categoria cat2 = new Categoria(null, "escritorio");

    categoriaRepository.save(Arrays.asList(cat1, cat2));
  }
}