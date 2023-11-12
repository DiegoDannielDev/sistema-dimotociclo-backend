package br.com.projeto.dimotociclo.infraestructure.jpa.port;

import br.com.projeto.dimotociclo.domain.model.ProdutoDTO;
import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import com.sun.istack.NotNull;

import java.util.List;

public interface ProdutoPort {

    ProdutoModel salvar(ProdutoDTO t);

    List<ProdutoModel> listarTodosProdutos();

    List<ProdutoModel> listarPorIdProduto(@NotNull Long idProduto);
}
