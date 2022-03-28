package br.com.projeto.dimotociclo.adapters.jpa.repository;

import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositoryJPA extends JpaRepository<ProdutoEntity, Long > {}
