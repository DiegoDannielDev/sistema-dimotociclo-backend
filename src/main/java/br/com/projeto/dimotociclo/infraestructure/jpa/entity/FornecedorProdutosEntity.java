package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import br.com.projeto.dimotociclo.infraestructure.jpa.entity.pk.FornecedorProdutosEntityPk;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "FornecedorProdutos")
public class FornecedorProdutosEntity {

    @EmbeddedId
    private FornecedorProdutosEntityPk fornecedorProdutosEntityPk;

    @ManyToOne
    @MapsId("fornecedores")
    @JoinColumn(columnDefinition = "fornecedores")
    private FornecedorEntity fornecedores;

    @ManyToOne
    @MapsId("produtoEntity")
    @JoinColumn(columnDefinition = "produtoEntity")
    private ProdutoEntity produtoEntity;
}
