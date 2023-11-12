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
@Entity(name = "valoresProdutos")
@Data
public class ValoresProdutosEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private BigDecimal valorVendaVarejo;
    private BigDecimal valorCompra;
    private BigDecimal valorCusto;
    private BigDecimal valorAtacado;
    private BigDecimal margemVendaAtacado;
    private BigDecimal margemVendaVarejo;
    private BigDecimal valorCompraProdutoUnitario;
    private BigDecimal valorLucroVendaVarejo;
    private BigDecimal valorLucroVendaAtacadado;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAlteracao;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "produto_id", unique = true)
    private ProdutoEntity produtoEntity;
}
