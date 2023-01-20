package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepositoryJPA extends JpaRepository<ProdutoEntity, Long> {


    @Query(value = "select p from produtos p where p.produtoId = :id")
    List<ProdutoEntity> buscarIdProduto(@Param("id") Long id);

}
