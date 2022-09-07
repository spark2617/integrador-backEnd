package com.br.dh.projeto.integrador.projetoIntegrador.repository;

import com.br.dh.projeto.integrador.projetoIntegrador.entities.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
