package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ICMS00 {
  public String orig;

  @JsonProperty("CST")
  public String cST;

  public String modBC;
  public String vBC;
  public String pICMS;
  public String vICMS;
}
