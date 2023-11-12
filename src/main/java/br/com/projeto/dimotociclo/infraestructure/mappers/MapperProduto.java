package br.com.projeto.dimotociclo.infraestructure.mappers;

import br.com.projeto.dimotociclo.adapters.request.ProdutoEntradaRequest;
import br.com.projeto.dimotociclo.adapters.response.ProdutoResponse;
import br.com.projeto.dimotociclo.domain.model.ComprasProdutoProdutoModel;
import br.com.projeto.dimotociclo.domain.model.ProdutoDTO;
import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.domain.model.nfe.Prod;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperProduto {

    ComprasProdutoProdutoModel toModel(Prod prod);

    ProdutoResponse mapperToResponse(ProdutoModel prod);

    @Mapping(target = "produtoValores.margemVendaAtacado", source = "prod.margemVendaAtacado")
    @Mapping(target = "produtoValores.margemVendaVarejo", source = "prod.margemVendaVarejo")
//    @Mapping(target = "produtoValores.valorVendaAtacado", source = "prod.valorVendaAtacado")
//    @Mapping(target = "produtoValores.valorVendaVarejo", source = "prod.valorVendaVarejo")
    @Mapping(target = "produtoValores.valorTotalCompra", source = "prod.valorTotalCompra")
//    @Mapping(target = "produtoValores.valorLucroVendaVarejo", source = "prod.valorLucroVendaVarejo")
//    @Mapping(target = "produtoValores.valorLucroVendaAtacadado", source = "prod.valorLucroVendaAtacadado")
    @Mapping(target = "produtoValores.valorCompraProdutoUnitario", source = "prod.valorCompraProdutoUnitario")
    ProdutoDTO mapperToDto(ProdutoEntradaRequest prod);

    Prod toDto(ComprasProdutoProdutoModel prod);
}
