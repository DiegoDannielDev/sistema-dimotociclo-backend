package br.com.projeto.dimotociclo.adapters.mappers;

import br.com.projeto.dimotociclo.adapters.request.AcessoUsuarioTelaRequest;
import br.com.projeto.dimotociclo.adapters.response.AcessoTelaPermissaoResponse;
import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcessoUsuarioTelaMappers {

  AcessoUsuarioTelaModel toModel(AcessoUsuarioTelaRequest acessoUsuarioTelaRequest);

  AcessoTelaPermissaoResponse mapperToResponse(AcessoTelaPermissaoModel prod);
}
