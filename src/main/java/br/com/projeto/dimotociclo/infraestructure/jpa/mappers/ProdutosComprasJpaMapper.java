package br.com.projeto.dimotociclo.infraestructure.jpa.mappers;

import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.ProdutoEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        typeConversionPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.FIELD)
public interface ProdutosComprasJpaMapper {

    @Mapping(target = "produtoId.codigoProduto", source = "produtoId")
    @Mapping(target = "produtoId.descricaoProduto", source = "descricaoProduto")
    @Mapping(target = "produtoId.situacaoProduto", source = "situacaoProduto")
    @Mapping(target = "produtoId.referenciaProduto", source = "referenciaProduto")
    @Mapping(target = "produtoId.produtoMarca", source = "produtoMarca")
    @Mapping(target = "produtoId.urlImagen", source = "urlImagen")
    @Mapping(target = "produtoId.categoria", source = "categoria")
    ProdutoModel mapperToDto(ProdutoEntity prod);
}
