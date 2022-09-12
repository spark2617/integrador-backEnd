package com.br.dh.projeto.integrador.projetoIntegrador.repository;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {



}
