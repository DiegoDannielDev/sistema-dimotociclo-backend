package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class ProdutoDTO {

    public String referenciaProduto;
    public ProdutoValores produtoValores;
    private Long codigoProduto;
    private String codigoBarras;
    private String codigoBarrasInterno;
    private String descricaoProduto;
    private String unidadeMedida;
    private BigDecimal quantidadeEstoqueProduto;
    private Long quantidadeMaximaEstoque;
    private Long quantidadeMinimaEstoque;
    private String controleEstoque;
    private String categoria;
    private Long codigoFornecedor;
    private String produtoMarca;
    private String localizacao;
    private String urlImagen;
    private String situacaoProduto;

    public void calculaValores() {
        this.produtoValores.calculaValores(quantidadeEstoqueProduto);
    }

}
