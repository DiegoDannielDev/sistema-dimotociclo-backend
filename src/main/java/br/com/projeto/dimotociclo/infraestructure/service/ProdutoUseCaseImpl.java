package br.com.projeto.dimotociclo.infraestructure.service;

import br.com.projeto.dimotociclo.domain.model.ProdutoDTO;
import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoUseCaseImpl {

    private final ProdutoPort repository;

    public ProdutoModel salvarProduto(ProdutoDTO request) {
        request.calculaValores();
        return repository.salvar(request);
    }

    public List<ProdutoModel> buscarTodos() {
        return repository.listarTodosProdutos();
    }

    public List<ProdutoModel> buscarPorId(Long idProduto) {
        return repository.listarPorIdProduto(idProduto);
    }
}
