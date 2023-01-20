package br.com.projeto.dimotociclo.adapters.mappers;

import br.com.projeto.dimotociclo.adapters.request.ProdutoEntradaRequest;
import br.com.projeto.dimotociclo.adapters.response.ProdutoResponse;
import br.com.projeto.dimotociclo.domain.model.ComprasProdutoProdutoModel;
import br.com.projeto.dimotociclo.domain.model.ProdutoDTO;
import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.domain.model.nfe.Prod;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperProduto {

  ComprasProdutoProdutoModel toModel(Prod prod);

  ProdutoResponse mapperToResponse(ProdutoModel prod);

  ProdutoDTO mapperToDto(ProdutoEntradaRequest prod);

  Prod toDto(ComprasProdutoProdutoModel prod);
}
