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
public class Imposto {
  @JsonProperty("ICMS")
  public ICMS iCMS;

  @JsonProperty("IPI")
  public IPI iPI;

  @JsonProperty("PIS")
  public PIS pIS;

  @JsonProperty("COFINS")
  public COFINS cOFINS;
}
