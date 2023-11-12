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
public class ValoresProdutos {

    private double valorVendaVarejo;
    private double valorCompra;
    private double valorCusto;
    private double margemVendaVarejo;
    private double valorAtacado;
    private double margemVendaAtacado;
    private Double valorLucroVendaVarejo;
    private Double valorLucroVendaAtacadado;
    private Double valorCompraProdutoUnitario;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAlteracao;
}
