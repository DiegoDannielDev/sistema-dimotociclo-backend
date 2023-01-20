package br.com.projeto.dimotociclo.adapters.integration.jpa.repository.impl;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.UsuarioEntity;
import br.com.projeto.dimotociclo.adapters.integration.jpa.mappers.UsuarioJpaMapper;
import br.com.projeto.dimotociclo.adapters.integration.jpa.port.UsuarioJpaPort;
import br.com.projeto.dimotociclo.adapters.integration.jpa.repository.UsuarioRepositoryJPA;
import br.com.projeto.dimotociclo.domain.exceptions.ErroNegocioException;
import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UsuarioRepositoryImpl implements UsuarioJpaPort {

  private final UsuarioRepositoryJPA repositoryJPA;
  private final UsuarioJpaMapper usuarioJpaMapper;

  private static Throwable run() {
    return new ErroNegocioException("Usuario não existe", HttpStatus.NOT_FOUND);
  }

  @Override
  public UsuarioModel buscarUsuario(String usuario, String senha) {
    return usuarioJpaMapper.toModel(repositoryJPA.verificarLogin(usuario, senha));
  }

  @Override
  public UsuarioModel salvarUsuario(UsuarioModel usuarioModel) {
    var userExist =
        this.repositoryJPA.findByLogin(usuarioModel.getLogin()).stream()
            .findAny()
            .orElse(UsuarioEntity.builder().build());
    assert  userExist.getLogin() != null;
    if (userExist.getLogin().equalsIgnoreCase(usuarioModel.getLogin())) {
      throw new ErroNegocioException(
          "Usuario ja existe com o nome cadastrado", HttpStatus.BAD_REQUEST);
    }
    return usuarioJpaMapper.toModel(repositoryJPA.save(usuarioJpaMapper.toEntity(usuarioModel)));
  }

  @Override
  public UsuarioModel buscarUsuarioId(Long id) {
    return this.repositoryJPA
        .findById(id)
        .map(usuarioJpaMapper::toModel)
        .orElseThrow(
            () -> new ErroNegocioException("Usuario não encontrado", HttpStatus.NOT_FOUND));
  }

  @Override
  public List<UsuarioModel> buscarTodos() {
    return repositoryJPA.findAll().stream()
        .map(usuarioJpaMapper::toModel)
        .collect(Collectors.toList());
  }
}
