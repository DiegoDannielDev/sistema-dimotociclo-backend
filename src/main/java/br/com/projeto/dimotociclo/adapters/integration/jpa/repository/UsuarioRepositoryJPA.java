package br.com.projeto.dimotociclo.adapters.integration.jpa.repository;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepositoryJPA extends JpaRepository<UsuarioEntity, Long> {

  @Query("select u from usuario u where u.login = :login and u.senha = :senha")
  UsuarioEntity verificarLogin(@Param("login") String login, @Param("senha") String senha);

  @Query("select u from usuario u where  upper(u.login) = upper(:login)")
  List<UsuarioEntity> findByLogin(String login);
}
