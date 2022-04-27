package br.com.projeto.dimotociclo.adapters.core.impl.mappers;

import br.com.projeto.dimotociclo.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.Prod;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperProduto {

  ProdutoModel toModel(Prod prod);

  ProdutoResponse mapperToResponse(ProdutoModel prod);

  ProdutoModel mapperToDto(ProdutoRequest prod);

  Prod toDto(ProdutoModel prod);
}
