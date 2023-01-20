package br.com.projeto.dimotociclo.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdutoCodigoBarrasRequest {
  private ProdutoEntradaRequest produtoEntradaRequest;
  private String codigoBarrasInterno;
  private String codigoBarrasExterno;
  private LocalDateTime dataInclusao;
  private LocalDateTime dataAlteracao;
}
