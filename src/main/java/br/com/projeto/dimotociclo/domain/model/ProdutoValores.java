package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoValores {

    private BigDecimal margemVendaAtacado;
    private BigDecimal margemVendaVarejo;
    private BigDecimal valorVendaAtacado;
    private BigDecimal valorVendaVarejo;
    private BigDecimal valorTotalCompra;
    private BigDecimal valorLucroVendaVarejo;
    private BigDecimal valorLucroVendaAtacadado;
    private BigDecimal valorCompraProdutoUnitario;

    public void calculaValores(BigDecimal quantidadeEstoqueProduto) {

        if (nonNull(margemVendaVarejo)) {
            valorVendaVarejo = valorCompraProdutoUnitario.add(margemVendaVarejo.divide(new BigDecimal("0.10")).multiply(valorCompraProdutoUnitario));

            valorLucroVendaVarejo = valorVendaVarejo.subtract(valorCompraProdutoUnitario);
        }

        if (isNull(valorTotalCompra)) {
            valorTotalCompra = quantidadeEstoqueProduto.multiply(valorCompraProdutoUnitario);
        }

        if (nonNull(margemVendaAtacado)) {
            valorVendaAtacado = valorCompraProdutoUnitario.add((margemVendaAtacado.divide(new BigDecimal("0.10")).multiply(valorCompraProdutoUnitario)));

            valorLucroVendaAtacadado = valorVendaAtacado.subtract(valorCompraProdutoUnitario);
        }
    }
}