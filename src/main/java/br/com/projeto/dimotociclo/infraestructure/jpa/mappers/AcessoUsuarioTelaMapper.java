package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.AcessoUsuarioTelaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcessoUsuarioTelaMapper {

    AcessoUsuarioTelaModel mapperToEntity(AcessoUsuarioTelaEntity prod);

    AcessoUsuarioTelaEntity mapperToDto(AcessoUsuarioTelaModel prod);

}
