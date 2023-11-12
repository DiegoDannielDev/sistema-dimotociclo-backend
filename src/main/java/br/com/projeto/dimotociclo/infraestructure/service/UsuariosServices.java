package br.com.projeto.dimotociclo.infraestructure.service;

import br.com.projeto.dimotociclo.domain.model.UsuarioModel;

import java.util.List;

public interface UsuariosServices {

    UsuarioModel buscarUsuario(String nome, String senha);

    UsuarioModel buscarUsuarioId(Long id);

    List<UsuarioModel> buscarTodosUsuarios();

    UsuarioModel salvar(UsuarioModel usuarioModel);
}
