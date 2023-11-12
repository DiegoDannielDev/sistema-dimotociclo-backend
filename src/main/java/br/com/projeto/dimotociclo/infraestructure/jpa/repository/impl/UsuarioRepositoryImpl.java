package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import br.com.projeto.dimotociclo.infraestructure.exceptions.ErroNegocioException;
import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.UsuarioJpaMapper;
import br.com.projeto.dimotociclo.infraestructure.jpa.port.UsuarioJpaPort;
import br.com.projeto.dimotociclo.infraestructure.jpa.repository.UsuarioRepositoryJPA;
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


    @Override
    public UsuarioModel buscarUsuario(String usuario, String senha) {
        return usuarioJpaMapper.toModel(repositoryJPA.verificarLogin(usuario, senha));
    }

    @Override
    public UsuarioModel salvarUsuario(UsuarioModel usuarioModel) {
//        var userExist = getExist(usuarioModel);

//        if (userExist) {
//            throw new ErroNegocioException("Usuario ja existe com o nome cadastrado", HttpStatus.BAD_REQUEST);
//        }
        return usuarioJpaMapper.toModel(repositoryJPA.save(usuarioJpaMapper.toEntity(usuarioModel)));
    }

    private Boolean getExist(UsuarioModel usuarioModel) {
        return this.repositoryJPA.findByLogin(usuarioModel.getLogin()).isPresent();

    }

    @Override
    public UsuarioModel buscarUsuarioId(Long id) {
        return this.repositoryJPA.findById(id).map(usuarioJpaMapper::toModel).orElseThrow(() -> new ErroNegocioException("Usuario não encontrado", HttpStatus.NOT_FOUND));
    }

    @Override
    public List<UsuarioModel> buscarTodos() {
        return repositoryJPA.findAll().stream().map(usuarioJpaMapper::toModel).collect(Collectors.toList());
    }
}
