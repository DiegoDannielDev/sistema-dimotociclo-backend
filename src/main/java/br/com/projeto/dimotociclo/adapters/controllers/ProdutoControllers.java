package br.com.projeto.dimotociclo.adapters.controllers;

import br.com.projeto.dimotociclo.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.ProdutoUseCaseImpl;
import br.com.projeto.dimotociclo.adapters.core.impl.mappers.MapperProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoControllers {

  private final ProdutoUseCaseImpl produtoUseCase;
  private final MapperProduto mapperProduto;

  @PostMapping("/salvar-produtos")
  public ResponseEntity<ProdutoResponse> salvarProdutos(@RequestBody ProdutoRequest request) {
    return ResponseEntity.ok(
        mapperProduto.mapperToResponse(
            produtoUseCase.salvarProduto(mapperProduto.mapperToDto(request))));
  }

  @GetMapping("/buscar-produtos")
  public ResponseEntity<List<ProdutoResponse>> listarTodosProdutos() {
    return ResponseEntity.ok(
        produtoUseCase.buscarTodos().stream()
            .map(mapperProduto::mapperToResponse)
            .collect(Collectors.toList()));
  }

  @GetMapping("/{id_produto}/buscar-produtos")
  public ResponseEntity<List<ProdutoResponse>> listarProdutosPorCodigo(
      @PathVariable(name = "id_produto") Long idProduto) {
    return ResponseEntity.ok(
        produtoUseCase.buscarPorId(idProduto).stream()
            .map(mapperProduto::mapperToResponse)
            .collect(Collectors.toList()));
  }
}
