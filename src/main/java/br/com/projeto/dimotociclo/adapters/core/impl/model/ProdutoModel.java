package br.com.projeto.dimotociclo.adapters.core.impl.model;

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

}
