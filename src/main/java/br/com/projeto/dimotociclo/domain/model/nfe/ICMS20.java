package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ICMS20 {
  public String orig;

  @JsonProperty("CST")
  public String cST;

  public String modBC;
  public String pRedBC;
  public String vBC;
  public String pICMS;
  public String vICMS;
}
