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
public class Dest {
  @JsonProperty("CNPJ")
  public String cNPJ;

  public String xNome;
  public EnderDest enderDest;
  public String indIEDest;

  @JsonProperty("IE")
  public String iE;

  public String email;
}
