package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdutoCodigoBarras {

    private Long codigoProduto;
    private String codigoBarrasInterno;
    private String codigoBarrasExterno;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAlteracao;
}
