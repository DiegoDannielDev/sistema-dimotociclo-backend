package br.com.projeto.dimotociclo.adapters.response;

import br.com.projeto.dimotociclo.domain.model.ProdutoId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProdutoEntradaResponse extends ProdutoId {

  private String codigoBarras;

  private String descricaoProduto;

  private String unidadeMedida;

  private Long quantidadeEstoque;

  public String referenciaProduto;

  private Double valorVenda;

  private Long codigoFornecedor;

  private String situacaoProduto;
}
