package br.com.projeto.dimotociclo.adapters.core.impl;


import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoUseCaseImpl {

    private final ProdutoPort repository;

    public ProdutoModel salvarProduto(ProdutoModel request) {
        return repository.salvar(request);
    }

    public List<ProdutoModel> buscarTodos() {
        return repository.listarTodosProdutos();
    }

    public List<ProdutoModel> buscarPorId(Long idProduto) {
        return repository.listarPorIdProduto(idProduto);
    }
}
