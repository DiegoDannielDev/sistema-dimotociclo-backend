package br.com.projeto.dimotociclo.adapters.jpa.port;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import com.sun.istack.NotNull;

import java.util.List;

public interface ProdutoPort {
  ProdutoModel salvar(ProdutoModel t);

  List<ProdutoModel> listarTodosProdutos();

  List<ProdutoModel> listarPorIdProduto(@NotNull Long idProduto);
}
