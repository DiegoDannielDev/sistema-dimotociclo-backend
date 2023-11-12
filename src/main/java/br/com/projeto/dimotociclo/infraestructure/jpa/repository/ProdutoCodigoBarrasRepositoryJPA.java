package br.com.projeto.dimotociclo.infraestructure.jpa.repository;

import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ProdutoCodigoBarrasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoCodigoBarrasRepositoryJPA
        extends JpaRepository<ProdutoCodigoBarrasEntity, Long> {
}
