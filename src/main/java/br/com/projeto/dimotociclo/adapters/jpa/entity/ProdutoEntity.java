package br.com.projeto.dimotociclo.adapters.jpa.entity;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity(name = "produtos")
public class ProdutoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    @Column(name = "quantidade_entrada")
    private BigDecimal quantidadeEntrada;
    @Column(name = "valor_entrada")
    private float valorEntrada;


    public static ProdutoEntity fromResponse(ProdutoModel produtoModel) {
        return ProdutoEntity.builder()
                .descricaoProduto(produtoModel.getDescricaoProduto())
                .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
                .valorEntrada(produtoModel.getValorEntrada())
                .build();
    }
}
