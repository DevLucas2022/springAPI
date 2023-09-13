package com.fatec.produto.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IImagemRepository extends JpaRepository<Imagem,Long> {
    Optional<Imagem> findByNome(String nome);
}
