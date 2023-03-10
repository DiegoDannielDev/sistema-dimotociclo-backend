package br.com.projeto.dimotociclo.adapters.request.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prod {
  public String cProd;
  public String cEAN;
  public String xProd;

  @JsonProperty("NCM")
  public String nCM;

  @JsonProperty("CFOP")
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

  @JsonProperty("CEST")
  public String cEST;

  public String indEscala;

  @JsonProperty("EXTIPI")
  public String eXTIPI;
}
