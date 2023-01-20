package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.EstoqueProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueProdutoRepositoryJPA extends JpaRepository<EstoqueProdutoEntity, Long> {
}
