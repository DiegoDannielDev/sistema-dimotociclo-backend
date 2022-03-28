package br.com.projeto.dimotociclo.adapters.controllers.response;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
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
@JsonNaming(value = SnakeCaseStrategy.class)
public class ProdutoResponse {

  private Long idProduto;
  private String descricaoProduto;
  private BigDecimal quantidadeEntrada;
  private float valorEntrada;

  public static ProdutoResponse fromResponse(ProdutoModel produtoModel) {
    return ProdutoResponse.builder()
            .idProduto(produtoModel.getIdProduto())
            .descricaoProduto(produtoModel.getDescricaoProduto())
            .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
            .valorEntrada(produtoModel.getValorEntrada())
            .build();
  }
}
