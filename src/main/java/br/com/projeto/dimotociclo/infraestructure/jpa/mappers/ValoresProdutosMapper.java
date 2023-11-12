package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.ValoresProdutos;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ValoresProdutosEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ValoresProdutosMapper {

    ValoresProdutos mapperToEntity(ValoresProdutosEntity prod);

    ValoresProdutosEntity mapperToDto(ValoresProdutos prod);
}
