package br.com.projeto.dimotociclo.adapters.jpa.repository.impl;


import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;
import br.com.projeto.dimotociclo.adapters.jpa.port.ProdutoPort;
import br.com.projeto.dimotociclo.adapters.jpa.repository.ProdutoRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProdutoRepositoryImpl implements ProdutoPort {

  private final ProdutoRepositoryJPA repositoryJPA;

  @Override
  public ProdutoModel salvar(ProdutoModel produtoModel) {
    return ProdutoModel.fromModel(repositoryJPA.save(ProdutoEntity.fromResponse(produtoModel)));
  }
}
