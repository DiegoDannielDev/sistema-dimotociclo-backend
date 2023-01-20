package br.com.projeto.dimotociclo.adapters.integration.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.ValoresProdutos;
import br.com.projeto.dimotociclo.adapters.integration.jpa.mappers.ValoresProdutosMapper;
import br.com.projeto.dimotociclo.adapters.integration.jpa.repository.ValoresProdutosRepositoryJPA;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ValoresProdutosRepositoryJPAImpl {

  private final ValoresProdutosRepositoryJPA valoresProdutosRepositoryJPA;
  private final ValoresProdutosMapper produtosMapper;

  @Lazy
  public ValoresProdutosRepositoryJPAImpl(
      ValoresProdutosRepositoryJPA valoresProdutosRepositoryJPA,
      ValoresProdutosMapper produtosMapper) {
    this.valoresProdutosRepositoryJPA = valoresProdutosRepositoryJPA;
    this.produtosMapper = produtosMapper;
  }

  public ValoresProdutos salvarValorProduto(ValoresProdutos valoresProdutos) {
    return produtosMapper.mapperToEntity(
        valoresProdutosRepositoryJPA.save(produtosMapper.mapperToDto(valoresProdutos)));
  }
}
