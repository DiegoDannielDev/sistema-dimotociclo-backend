package br.com.projeto.dimotociclo.adapters.request.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetPag {
  public String indPag;
  public String tPag;
  public String vPag;
}
