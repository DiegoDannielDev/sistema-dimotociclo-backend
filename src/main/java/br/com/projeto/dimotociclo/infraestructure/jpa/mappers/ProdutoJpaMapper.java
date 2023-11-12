package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ProdutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoJpaMapper {

    @Mapping(source = "produtoId.codigoProduto", target = "produtoId")
    ProdutoEntity mapperToEntity(ProdutoModel prod);

    @Mapping(target = "produtoId.codigoProduto", source = "produtoId")
    ProdutoModel mapperToDto(ProdutoEntity prod);
}
