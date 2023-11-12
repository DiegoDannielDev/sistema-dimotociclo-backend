package br.com.projeto.dimotociclo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ComprasProdutoProdutoModel {

    public String cProd;
    public String cEAN;
    public String xProd;
    public String nCM;
    public String cFOP;
    public String uCom;
    public String qCom;
    public Double vUnCom;
    public Double vProd;
    public String cEANTrib;
    public String uTrib;
    public String qTrib;
    public Double vUnTrib;
    public Double vFrete;
    public String indTot;
    public String xPed;
    public String nItemPed;
    public String cEST;
    public String indEscala;
    public String eXTIPI;
}
