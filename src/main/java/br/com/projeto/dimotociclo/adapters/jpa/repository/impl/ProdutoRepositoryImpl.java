package br.com.projeto.dimotociclo.adapters.jpa.repository.impl;


import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.mappers.ProdutoJpaMapper;
import br.com.projeto.dimotociclo.adapters.jpa.port.ProdutoPort;
import br.com.projeto.dimotociclo.adapters.jpa.repository.ProdutoRepositoryJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class ProdutoRepositoryImpl implements ProdutoPort {

    private final ProdutoRepositoryJPA repositoryJPA;

    @Override
    public ProdutoModel salvar(ProdutoModel produtoModel) {
        return ProdutoJpaMapper.mapperToDto(repositoryJPA.save(Objects.requireNonNull(ProdutoJpaMapper.mapperToEntity(produtoModel))));
    }

    @Override
    public List<ProdutoModel> listarTodosProdutos() {
        return ProdutoJpaMapper.mapperToModel(repositoryJPA.findAll());
    }

    @Override
    public List<ProdutoModel> listarPorIdProduto(Long idProduto) {
        return ProdutoJpaMapper.mapperToModel(repositoryJPA.buscarIdProduto(idProduto));
    }
}
