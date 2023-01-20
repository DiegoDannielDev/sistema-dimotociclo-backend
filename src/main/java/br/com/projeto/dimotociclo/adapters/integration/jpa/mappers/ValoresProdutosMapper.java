package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.ValoresProdutosEntity;
import br.com.projeto.dimotociclo.domain.model.ValoresProdutos;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ValoresProdutosMapper {

  ValoresProdutos mapperToEntity(ValoresProdutosEntity prod);

  ValoresProdutosEntity mapperToDto(ValoresProdutos prod);
}
