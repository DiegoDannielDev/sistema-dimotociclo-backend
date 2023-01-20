package br.com.projeto.dimotociclo.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EstoqueProdutoRequest {
  private ProdutoEntradaRequest produtoEntradaRequest;
  private double qtdeEstoque;
  private double qtdeMaxima;
  private double qtdeMinima;
  private String unidadeMedida;
  private LocalDateTime dataInclusao;
  private LocalDateTime dataAlteracao;
  private String produtoInativo;
}
