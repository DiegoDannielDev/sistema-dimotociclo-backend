package br.com.projeto.dimotociclo.infraestructure.jpa.repository;

import br.com.projeto.dimotociclo.infraestructure.jpa.entity.EstoqueProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueProdutoRepositoryJPA extends JpaRepository<EstoqueProdutoEntity, Long> {
}
