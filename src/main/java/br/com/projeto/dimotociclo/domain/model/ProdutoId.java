package br.com.projeto.dimotociclo.domain.model;

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
public class ProdutoId {

    public String referenciaProduto;
    private Long codigoProduto;
    private String situacaoProduto;
    private String descricaoProduto;
    private String produtoMarca;
    private String urlImagen;
    private String categoria;
}
