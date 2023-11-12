package br.com.projeto.dimotociclo.adapters.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProdutoEntradaRequest {

    public String referenciaProduto;
    public Double margemVendaAtacado;
    public Double margemVendaVarejo;
    private Long codigoProduto;
    private String codigoBarras;
    private String codigoBarrasInterno;
    private String descricaoProduto;
    private String unidadeMedida;
    private Long quantidadeEstoqueProduto;
    private Long quantidadeMaximaEstoque;
    private Long quantidadeMinimaEstoque;
    private String controleEstoque;
    private String categoria;
    private Double valorVendaProduto;

    private Double valorTotalCompra;

    private Double valorCompraProdutoUnitario;

    private Long codigoFornecedor;

    private String produtoMarca;

    private String localizacao;

    private String urlImagen;

    private String situacaoProduto;
}
