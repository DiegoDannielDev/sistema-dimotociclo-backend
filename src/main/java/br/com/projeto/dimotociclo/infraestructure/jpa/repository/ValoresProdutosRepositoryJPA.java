package br.com.projeto.dimotociclo.infraestructure.jpa.repository;

import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ValoresProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoresProdutosRepositoryJPA extends JpaRepository<ValoresProdutosEntity, Long> {
}
