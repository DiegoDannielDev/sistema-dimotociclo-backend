package br.com.projeto.dimotociclo.adapters.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity(name = "produtos")
public class ProdutoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  public String cProd;
  public String cEAN;
  public String xProd;
  public String nCM;
  public String cFOP;
  public String uCom;
  public String qCom;
  public String vUnCom;
  public String vProd;
  public String cEANTrib;
  public String uTrib;
  public String qTrib;
  public String vUnTrib;
  public String vFrete;
  public String indTot;
  public String xPed;
  public String nItemPed;
  public String cEST;
  public String indEscala;
  public String eXTIPI;
}
