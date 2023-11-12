package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.ProdutoCodigoBarras;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ProdutoCodigoBarrasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoCodigoBarrasJpaMapper {

    ProdutoCodigoBarrasEntity mapperToEntity(ProdutoCodigoBarras codigoBarras);

    ProdutoCodigoBarras mapperToDto(ProdutoCodigoBarrasEntity prod);
}
