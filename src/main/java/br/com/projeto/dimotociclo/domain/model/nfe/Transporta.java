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
public class Transporta {
  @JsonProperty("CNPJ")
  public String cNPJ;

  public String xNome;
  public String xEnder;
  public String xMun;

  @JsonProperty("UF")
  public String uF;
}
