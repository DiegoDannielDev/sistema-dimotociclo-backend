package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.EstoqueProdutoEntity;
import br.com.projeto.dimotociclo.domain.model.EstoqueProduto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstoqueProdutoMapper {

  EstoqueProduto mapperToEntity(EstoqueProdutoEntity prod);

  EstoqueProdutoEntity mapperToDto(EstoqueProduto prod);
}
