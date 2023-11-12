package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.EstoqueProduto;
import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.EstoqueProdutoMapper;
import br.com.projeto.dimotociclo.infraestructure.jpa.repository.EstoqueProdutoRepositoryJPA;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class EstoqueProdutoRepositoryJPAImpl {

    private final EstoqueProdutoRepositoryJPA estoqueProdutoRepositoryJPA;
    private final EstoqueProdutoMapper produtoMapper;

    @Lazy
    public EstoqueProdutoRepositoryJPAImpl(
            EstoqueProdutoRepositoryJPA estoqueProdutoRepositoryJPA, EstoqueProdutoMapper produtoMapper) {
        this.estoqueProdutoRepositoryJPA = estoqueProdutoRepositoryJPA;
        this.produtoMapper = produtoMapper;
    }

    public EstoqueProduto salvarProdutoEstoque(EstoqueProduto produtoDTO) {
        return produtoMapper.mapperToEntity(
                this.estoqueProdutoRepositoryJPA.save(produtoMapper.mapperToDto(produtoDTO)));
    }
}
