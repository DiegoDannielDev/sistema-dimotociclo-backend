package br.com.projeto.dimotociclo.adapters.core.impl.model;

import br.com.projeto.dimotociclo.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ProdutoModel {

    private Long idProduto;
    private String descricaoProduto;
    private BigDecimal quantidadeEntrada;
    private float valorEntrada;

    public static ProdutoModel fromModel(ProdutoEntity produtoEntity) {
        return ProdutoModel.builder()
                .idProduto(produtoEntity.getId())
                .descricaoProduto(produtoEntity.getDescricaoProduto())
                .quantidadeEntrada(produtoEntity.getQuantidadeEntrada())
                .valorEntrada(produtoEntity.getValorEntrada())
                .build();
    }

    public static ProdutoModel toRequest(ProdutoRequest request){
        return ProdutoModel.builder()
                .descricaoProduto(request.getDescricaoProduto())
                .quantidadeEntrada(request.getQuantidadeEntrada())
                .valorEntrada(request.getValorEntrada())
                .build();
    }
}
