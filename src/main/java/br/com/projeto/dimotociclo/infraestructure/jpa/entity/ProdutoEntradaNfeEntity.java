package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Table(name = "compras_produtos")
//@Entity(name = "ProdutoEntity")
public class ProdutoEntradaNfeEntity {

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
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long codigoProdutoInterno;
}
