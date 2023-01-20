package br.com.projeto.dimotociclo.adapters.web;

import br.com.projeto.dimotociclo.adapters.request.ProdutoEntradaRequest;
import br.com.projeto.dimotociclo.adapters.response.ProdutoResponse;
import br.com.projeto.dimotociclo.domain.usecases.ProdutoUseCaseImpl;
import br.com.projeto.dimotociclo.adapters.mappers.MapperProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/produtos")
@RequiredArgsConstructor
public class ProdutoControllers {

  private final ProdutoUseCaseImpl produtoUseCase;
  private final MapperProduto mapperProduto;

  @PostMapping(
      value = "/salvar-produtos",
      produces = APPLICATION_JSON_VALUE,
      consumes = APPLICATION_JSON_VALUE)
  public ResponseEntity<ProdutoResponse> salvarProdutos(
      @RequestBody ProdutoEntradaRequest request) {

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
  @ResponseStatus(value = HttpStatus.OK)
  public List<?> listarProdutosPorCodigo(@PathVariable(name = "id_produto") Long idProduto) {
    return produtoUseCase.buscarPorId(idProduto).stream()
        .map(mapperProduto::mapperToResponse)
        .collect(Collectors.toList());
  }
}
