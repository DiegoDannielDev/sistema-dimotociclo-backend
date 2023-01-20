package br.com.projeto.dimotociclo.adapters.integration.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
@Entity(name = "produtos")
public class ProdutoEntity {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long produtoId;

  private String descricaoProduto;
  public String referenciaProduto;
  private String produtoMarca;
  private String urlImagen;
  private String categoria;
  private String situacaoProduto;

  @Transient private ProdutoCodigoBarrasEntity codigoBarras;

  @Transient private EstoqueProdutoEntity estoqueProduto;

  @Transient private ValoresProdutosEntity valoresProdutos;

  @Transient private FornecedorProdutosEntity fornecedorProdutos;

}
