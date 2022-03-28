package br.com.projeto.dimotociclo.adapters.jpa.port;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;

public interface ProdutoPort {
  ProdutoModel salvar(ProdutoModel t);
}
