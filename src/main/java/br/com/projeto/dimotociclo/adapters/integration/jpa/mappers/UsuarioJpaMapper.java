package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.UsuarioEntity;
import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioJpaMapper {

  UsuarioModel toModel(UsuarioEntity usuarioEntity);

  UsuarioEntity toEntity(UsuarioModel usuarioModel);
}
