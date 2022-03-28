package br.com.projeto.dimotociclo.adapters.controllers.request;

import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
