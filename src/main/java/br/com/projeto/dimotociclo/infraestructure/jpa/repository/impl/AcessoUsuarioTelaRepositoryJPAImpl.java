package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.AcessoUsuarioTelaMapper;
import br.com.projeto.dimotociclo.infraestructure.jpa.port.AcessoUsuarioTelaPort;
import br.com.projeto.dimotociclo.infraestructure.jpa.repository.AcessoUsuarioTelaRepositoryJPA;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class AcessoUsuarioTelaRepositoryJPAImpl implements AcessoUsuarioTelaPort {
    private final AcessoUsuarioTelaRepositoryJPA acessoUsuarioTelaRepositoryJPA;
    private final AcessoUsuarioTelaMapper acessoUsuarioTelaMapper;

    @Lazy
    public AcessoUsuarioTelaRepositoryJPAImpl(
            AcessoUsuarioTelaRepositoryJPA acessoUsuarioTelaRepositoryJPA,
            AcessoUsuarioTelaMapper acessoUsuarioTelaMapper) {
        this.acessoUsuarioTelaRepositoryJPA = acessoUsuarioTelaRepositoryJPA;
        this.acessoUsuarioTelaMapper = acessoUsuarioTelaMapper;
    }

    @Override
    public AcessoUsuarioTelaModel salvarAcessoTela(AcessoUsuarioTelaModel usuarioTelaModel) {
        var entity = this.acessoUsuarioTelaMapper.mapperToDto(usuarioTelaModel);
        var entityExist =
                this.acessoUsuarioTelaRepositoryJPA.isExistPermissao(
                        entity.getNomeTela(), entity.getCodigoUsuario());
        if (Objects.nonNull(entityExist)) {
            entity.setId(entityExist.getId());
        }

        return this.acessoUsuarioTelaMapper.mapperToEntity(acessoUsuarioTelaRepositoryJPA.save(entity));
    }

    @Override
    public boolean deletarAcessoUsuario(Long codigoUsuario) {
        return this.acessoUsuarioTelaRepositoryJPA.deleteByCodigoUsuario(codigoUsuario);
    }

    @Override
    public List<AcessoUsuarioTelaModel> isAcessoPermitido(Long codigoUsuario) {
        return acessoUsuarioTelaRepositoryJPA.findByCodigoUsuario(codigoUsuario).stream()
                .map(acessoUsuarioTelaMapper::mapperToEntity)
                .collect(Collectors.toList());
    }
}
