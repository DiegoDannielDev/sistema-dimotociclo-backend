package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "estoqueProduto")
public class EstoqueProdutoEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "produto_id", unique = true)
    private ProdutoEntity produtoEntity;

    private BigDecimal quantidadeEstoqueProduto;

    private Long quantidadeMaximaEstoque;

    private Long quantidadeMinimaEstoque;

    private String unidadeMedida;

    private LocalDateTime dataInclusao;

    private LocalDateTime dataAlteracao;

}
