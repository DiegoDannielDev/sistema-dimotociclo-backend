package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class ProdutoDTO {

  private Long codigoProduto;

  private String codigoBarras;

  private String codigoBarrasInterno;

  private String descricaoProduto;

  private String unidadeMedida;

  private Long quantidadeEstoqueProduto;

  private Long quantidadeMaximaEstoque;

  private Long quantidadeMinimaEstoque;

  private String controleEstoque;

  public String referenciaProduto;

  private String categoria;

  public Double margemVendaAtacado;

  public Double margemVendaVarejo;

  private Double valorVendaAtacado;

  private Double valorVendaVarejo;

  private Double valorTotalCompra;

  private Double valorLucroVendaVarejo;

  private Double valorLucroVendaAtacadado;

  private Double valorCompraProdutoUnitario;

  private Long codigoFornecedor;

  private String produtoMarca;

  private String localizacao;

  private String urlImagen;

  private String situacaoProduto;

  public void calculaValores() {

    if (nonNull(margemVendaVarejo)) {
      valorVendaVarejo =
          getValorCompraProdutoUnitario()
              + ((margemVendaVarejo / 100) * getValorCompraProdutoUnitario());

      valorLucroVendaVarejo = valorVendaVarejo - valorCompraProdutoUnitario;
    }

    if (isNull(valorTotalCompra)) {
      valorTotalCompra = quantidadeEstoqueProduto * valorCompraProdutoUnitario;
    }

    if (nonNull(margemVendaAtacado)) {
      valorVendaAtacado =
          getValorCompraProdutoUnitario()
              + ((margemVendaAtacado / 100) * getValorCompraProdutoUnitario());

      valorLucroVendaAtacadado = valorVendaAtacado - valorCompraProdutoUnitario;
    }
  }

}
