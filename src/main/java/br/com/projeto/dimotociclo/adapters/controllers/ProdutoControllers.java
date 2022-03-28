package br.com.projeto.dimotociclo.adapters.controllers;

import br.com.projeto.dimotociclo.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.ProdutoUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoControllers {

  private final ProdutoUseCaseImpl produtoUseCase;

  @PostMapping("/salvar-produtos")
  public ResponseEntity<ProdutoResponse> salvarProdutos(@RequestBody ProdutoRequest request) {
    return ResponseEntity.ok(produtoUseCase.salvarProduto(request));
  }
}
