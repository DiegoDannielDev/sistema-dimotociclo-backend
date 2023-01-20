package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
