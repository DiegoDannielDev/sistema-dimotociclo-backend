package br.com.projeto.dimotociclo.adapters.integration.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

  private double valorVendaVarejo;
  private double valorCompra;
  private double valorCusto;
  private double valorAtacado;
  private double margemVendaAtacado;
  private double margemVendaVarejo;
  private double valorCompraProdutoUnitario;
  private Double valorLucroVendaVarejo;
  private Double valorLucroVendaAtacadado;
  private LocalDateTime dataInclusao;
  private LocalDateTime dataAlteracao;

  @OneToOne(orphanRemoval = true)
  @JoinColumn(name = "produto_id", unique = true)
  private ProdutoEntity produtoEntity;
}
