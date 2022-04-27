package br.com.projeto.dimotociclo.adapters.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoJpaMapper {
  ProdutoModel mapperToDto(ProdutoEntity prod);

  ProdutoEntity mapperToEntity(ProdutoModel prod);
}
