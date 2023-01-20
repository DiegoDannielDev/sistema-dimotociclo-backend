package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdutoModel {

  private ProdutoId produtoId;

  private ProdutoCodigoBarras codigoBarras;

  private EstoqueProduto estoqueProduto;

  private ValoresProdutos valoresProdutos;

  //  private FornecedorProdutos fornecedorProdutos;

}
