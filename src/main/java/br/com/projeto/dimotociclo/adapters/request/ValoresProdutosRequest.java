package br.com.projeto.dimotociclo.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValoresProdutosRequest {
  private ProdutoEntradaRequest produtoEntradaRequest;
  private double valorVendaVarejo;
  private double valorCompra;
  private double valorCusto;
  private double margeVendaVarejo;
  private double valorAtacado;
  private double margeVendaAtacado;
  private LocalDateTime dataInclusao;
  private LocalDateTime dataAlteracao;
}
