package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.FornecedorProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorProdutoRepositoryJPA
    extends JpaRepository<FornecedorProdutosEntity, Long> {}
