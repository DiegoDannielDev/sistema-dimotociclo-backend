package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioJpaMapper {

    UsuarioModel toModel(UsuarioEntity usuarioEntity);

    UsuarioEntity toEntity(UsuarioModel usuarioModel);
}
