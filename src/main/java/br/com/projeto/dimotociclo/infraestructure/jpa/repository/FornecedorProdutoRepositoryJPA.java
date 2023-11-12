package br.com.projeto.dimotociclo.infraestructure.jpa.repository;

import br.com.projeto.dimotociclo.infraestructure.jpa.entity.FornecedorProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorProdutoRepositoryJPA
        extends JpaRepository<FornecedorProdutosEntity, Long> {
}
