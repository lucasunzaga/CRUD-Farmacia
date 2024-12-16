package com.crud.farma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.farma.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	Categoria findByNome(String nome);
}
