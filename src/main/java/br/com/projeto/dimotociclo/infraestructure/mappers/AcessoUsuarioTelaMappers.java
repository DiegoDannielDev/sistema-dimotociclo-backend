package br.com.projeto.dimotociclo.infraestructure.mappers;

import br.com.projeto.dimotociclo.adapters.request.UsuarioAcessos;
import br.com.projeto.dimotociclo.adapters.response.AcessoTelaPermissaoResponse;
import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.UsuarioAcessosModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AcessoUsuarioTelaMappers {

    @Mapping(target = "acessoUsuarioTelaModels", source = "acessoUsuarioTelaRequests")
    UsuarioAcessosModel toModel(UsuarioAcessos acessoUsuarioTelaRequest);

    AcessoTelaPermissaoResponse mapperToResponse(AcessoTelaPermissaoModel prod);
}
