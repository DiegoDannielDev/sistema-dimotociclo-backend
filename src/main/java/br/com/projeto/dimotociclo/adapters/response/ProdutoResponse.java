package br.com.projeto.dimotociclo.adapters.response;

import br.com.projeto.dimotociclo.domain.model.ProdutoId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProdutoResponse {

  @JsonProperty("produto")
  private ProdutoId produtoId;

  @JsonProperty("produto_codigo_barras")
  private ProdutoCodigoBarrasResponse codigoBarras;

  @JsonProperty("produto_estoque")
  private EstoqueProdutoResponse estoqueProduto;

  @JsonProperty("produto_valores")
  private ValoresProdutosResponse valoresProdutos;

  @JsonProperty("produto_fornecedor")
  private FornecedorProdutosResponse fornecedorProdutosResponse;

}
