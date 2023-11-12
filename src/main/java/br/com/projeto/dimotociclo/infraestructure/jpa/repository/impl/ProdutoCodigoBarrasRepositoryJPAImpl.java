package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.ProdutoCodigoBarras;
import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.ProdutoCodigoBarrasJpaMapper;
import br.com.projeto.dimotociclo.infraestructure.jpa.repository.ProdutoCodigoBarrasRepositoryJPA;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ProdutoCodigoBarrasRepositoryJPAImpl {

    private final ProdutoCodigoBarrasRepositoryJPA repositoryJPA;

    private final ProdutoCodigoBarrasJpaMapper barrasJpaMapper;

    @Lazy
    public ProdutoCodigoBarrasRepositoryJPAImpl(
            ProdutoCodigoBarrasRepositoryJPA repositoryJPA,
            ProdutoCodigoBarrasJpaMapper barrasJpaMapper) {
        this.repositoryJPA = repositoryJPA;
        this.barrasJpaMapper = barrasJpaMapper;
    }

    public ProdutoCodigoBarras saveCodigoBarrasEntity(ProdutoCodigoBarras produtoCodigoBarras) {
        return barrasJpaMapper.mapperToDto(
                this.repositoryJPA.save(barrasJpaMapper.mapperToEntity(produtoCodigoBarras)));
    }
}
