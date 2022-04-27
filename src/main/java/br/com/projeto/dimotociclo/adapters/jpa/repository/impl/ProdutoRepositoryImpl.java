package br.com.projeto.dimotociclo.adapters.jpa.repository.impl;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.mappers.ProdutoJpaMapper;
import br.com.projeto.dimotociclo.adapters.jpa.port.ProdutoPort;
import br.com.projeto.dimotociclo.adapters.jpa.repository.ProdutoRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProdutoRepositoryImpl implements ProdutoPort {

  private final ProdutoRepositoryJPA repositoryJPA;
  private final ProdutoJpaMapper mapper;

  @Override
  public ProdutoModel salvar(ProdutoModel produtoModel) {
    return mapper.mapperToDto(
        repositoryJPA.save(Objects.requireNonNull(mapper.mapperToEntity(produtoModel))));
  }

  @Override
  public List<ProdutoModel> listarTodosProdutos() {
    return repositoryJPA.findAll().stream().map(mapper::mapperToDto).collect(Collectors.toList());
  }

  @Override
  public List<ProdutoModel> listarPorIdProduto(Long idProduto) {
    return repositoryJPA.buscarIdProduto(idProduto).stream()
        .map(mapper::mapperToDto)
        .collect(Collectors.toList());
  }
}
