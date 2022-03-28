package br.com.projeto.dimotociclo.adapters.core.impl;

import br.com.projeto.dimotociclo.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoUseCaseImpl {

  private final ProdutoPort repository;

  public ProdutoResponse salvarProduto(ProdutoRequest request) {
    return ProdutoResponse.fromResponse(repository.salvar(ProdutoModel.toRequest(request)));
  }
}
