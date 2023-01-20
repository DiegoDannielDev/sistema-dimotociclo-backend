package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.ProdutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoJpaMapper {

  @Mapping(source = "produtoId.codigoProduto", target = "produtoId")
  ProdutoEntity mapperToEntity(ProdutoModel prod);

  @Mapping(target = "produtoId.codigoProduto", source = "produtoId")
  ProdutoModel mapperToDto(ProdutoEntity prod);
}
