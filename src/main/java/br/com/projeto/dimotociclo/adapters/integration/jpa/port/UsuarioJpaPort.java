package br.com.projeto.dimotociclo.adapters.integration.jpa.port;

import br.com.projeto.dimotociclo.domain.model.UsuarioModel;

import java.util.List;

public interface UsuarioJpaPort {

  UsuarioModel buscarUsuario(String usuario, String senha);
  UsuarioModel salvarUsuario(UsuarioModel usuarioModel);
  UsuarioModel buscarUsuarioId(Long id);
  List<UsuarioModel> buscarTodos();
}
