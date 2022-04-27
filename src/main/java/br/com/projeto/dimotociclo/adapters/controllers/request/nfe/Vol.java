package br.com.projeto.dimotociclo.adapters.controllers.request.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vol {
  public String qVol;
  public String nVol;
  public String pesoL;
  public String pesoB;
}
