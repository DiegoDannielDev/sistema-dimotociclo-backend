package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EstoqueProduto {

  private Long quantidadeEstoqueProduto;

  private Long quantidadeMaximaEstoque;

  private Long quantidadeMinimaEstoque;

  private String unidadeMedida;

  private LocalDateTime dataInclusao;

  private LocalDateTime dataAlteracao;
}
