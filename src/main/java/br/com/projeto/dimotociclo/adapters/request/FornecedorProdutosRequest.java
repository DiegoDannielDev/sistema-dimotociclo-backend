package br.com.projeto.dimotociclo.adapters.request;

import br.com.projeto.dimotociclo.domain.model.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FornecedorProdutosRequest {
    private ProdutoEntradaRequest produtoEntradaRequest;
    private Fornecedor fornecedores;
}
