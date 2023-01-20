package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.ProdutoCodigoBarrasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoCodigoBarrasRepositoryJPA
    extends JpaRepository<ProdutoCodigoBarrasEntity, Long> {}
