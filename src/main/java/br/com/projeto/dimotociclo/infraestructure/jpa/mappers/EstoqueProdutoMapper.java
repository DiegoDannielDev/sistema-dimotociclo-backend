package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.EstoqueProduto;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.EstoqueProdutoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstoqueProdutoMapper {

    EstoqueProduto mapperToEntity(EstoqueProdutoEntity prod);

    EstoqueProdutoEntity mapperToDto(EstoqueProduto prod);
}
