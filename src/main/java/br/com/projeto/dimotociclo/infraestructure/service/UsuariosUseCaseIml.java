package br.com.projeto.dimotociclo.infraestructure.service;

import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.port.UsuarioJpaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class UsuariosUseCaseIml implements UsuariosServices {

    private final UsuarioJpaPort usuarioJpaPort;

    @Override
    public UsuarioModel buscarUsuario(String nome, String senha) {
        return this.usuarioJpaPort.buscarUsuario(nome, senha);
    }

    @Override
    public UsuarioModel buscarUsuarioId(Long id) {
        return this.usuarioJpaPort.buscarUsuarioId(id);
    }

    @Override
    public List<UsuarioModel> buscarTodosUsuarios() {
        return usuarioJpaPort.buscarTodos();
    }

    @Override
    public UsuarioModel salvar(UsuarioModel usuarioModel) {
        validUser(usuarioModel);
        return usuarioJpaPort.salvarUsuario(usuarioModel);
    }

    private void validUser(UsuarioModel usuarioModel) {

    }
}
