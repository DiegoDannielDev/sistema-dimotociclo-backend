package br.com.projeto.dimotociclo.adapters.controllers.response;

import com.fasterxml.jackson.annotation.JsonTypeName;
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
@JsonTypeName("data")
@JsonNaming(value = SnakeCaseStrategy.class)
public class ProdutoResponse {

  private Long idProduto;
  private String descricaoProduto;
  private BigDecimal quantidadeEntrada;
  private float valorEntrada;


}
