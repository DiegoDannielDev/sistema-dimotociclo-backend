package br.com.projeto.dimotociclo.adapters.integration.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.integration.jpa.entity.ProdutoCodigoBarrasEntity;
import br.com.projeto.dimotociclo.domain.model.ProdutoCodigoBarras;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoCodigoBarrasJpaMapper {

  ProdutoCodigoBarrasEntity mapperToEntity(ProdutoCodigoBarras codigoBarras);

  ProdutoCodigoBarras mapperToDto(ProdutoCodigoBarrasEntity prod);
}
