package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.AcessoUsuarioTelaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcessoUsuarioTelaRepositoryJPA extends JpaRepository<AcessoUsuarioTelaEntity, Long> {
  List<AcessoUsuarioTelaEntity> findByCodigoUsuario(Long codigoUsuario);

  @Query("select a from acessoUsuarioTela a " +
          "where a.nomeTela = :nomeTela and a.codigoUsuario = :codigoUsuario")
  AcessoUsuarioTelaEntity isExistPermissao(@Param("nomeTela") String nomeTela, @Param("codigoUsuario") Long codigoUsuario);

  boolean deleteByCodigoUsuario(Long codigoUsuario);
}
