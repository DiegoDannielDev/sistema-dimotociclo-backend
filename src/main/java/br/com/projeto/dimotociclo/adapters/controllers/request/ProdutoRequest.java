package br.com.projeto.dimotociclo.adapters.adapters.controllers.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ProdutoRequest {

    @JsonProperty("descricao_produto")
    private String descricaoProduto;
    @JsonProperty("quantidade_produto")
    private BigDecimal quantidadeEntrada;
    @JsonProperty("valor_entrada")
    private float valorEntrada;

}
