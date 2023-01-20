package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.AcessoUsuarioTelaEntity;
import br.com.projeto.dimotociclo.adapters.response.AcessoTelaPermissaoResponse;
import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcessoUsuarioTelaMapper {

  AcessoUsuarioTelaModel mapperToEntity(AcessoUsuarioTelaEntity prod);
  AcessoUsuarioTelaEntity mapperToDto(AcessoUsuarioTelaModel prod);

}
