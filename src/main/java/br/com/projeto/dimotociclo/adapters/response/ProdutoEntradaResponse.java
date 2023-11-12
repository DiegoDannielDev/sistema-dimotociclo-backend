package br.com.projeto.dimotociclo.adapters.response;

import br.com.projeto.dimotociclo.domain.model.ProdutoId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProdutoEntradaResponse extends ProdutoId {

    public String referenciaProduto;
    private String codigoBarras;
    private String descricaoProduto;
    private String unidadeMedida;
    private Long quantidadeEstoque;
    private Double valorVenda;

    private Long codigoFornecedor;

    private String situacaoProduto;
}
