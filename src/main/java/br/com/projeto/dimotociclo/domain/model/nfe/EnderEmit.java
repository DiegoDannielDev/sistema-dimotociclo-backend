package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderEmit {
  public String xLgr;
  public String nro;
  public String xBairro;
  public String cMun;
  public String xMun;

  @JsonProperty("UF")
  public String uF;

  @JsonProperty("CEP")
  public String cEP;

  public String cPais;
  public String xPais;
  public String fone;
}
