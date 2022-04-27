package br.com.projeto.dimotociclo.adapters.controllers;

import br.com.projeto.dimotociclo.adapters.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.ProdutoUseCaseImpl;
import br.com.projeto.dimotociclo.adapters.core.impl.mappers.ProdutoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.projeto.dimotociclo.adapters.core.impl.mappers.ProdutoMapper.mapperToResponse;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoControllers {

    private final ProdutoUseCaseImpl produtoUseCase;

    @PostMapping("/salvar-produtos")
    public ResponseEntity<ProdutoResponse> salvarProdutos(@RequestBody ProdutoRequest request) {
        return ResponseEntity.ok(mapperToResponse(produtoUseCase.salvarProduto(ProdutoMapper.mapperToDto(request))));
    }


    @GetMapping("/buscar-produtos")
    public ResponseEntity<List<ProdutoResponse>> listarTodosProdutos() {
        return ResponseEntity.ok(mapperToResponse(produtoUseCase.buscarTodos()));
    }


    @GetMapping("/{id_produto}/buscar-produtos")
    public ResponseEntity<List<ProdutoResponse>> listarProdutosPorCodigo(@PathVariable(name = "id_produto") Long idProduto) {
        return ResponseEntity.ok(mapperToResponse(produtoUseCase.buscarPorId(idProduto)));
    }

}
