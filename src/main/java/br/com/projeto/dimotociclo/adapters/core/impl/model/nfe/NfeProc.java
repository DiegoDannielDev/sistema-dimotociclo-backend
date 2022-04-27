package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeProc {
  @JsonProperty("NFe")
  public NFe nFe;

  @JsonProperty("protNFe")
  public ProtNFe protNFe;

  @JsonIgnoreProperties public String _xmlns;
  @JsonIgnoreProperties public String _versao;
}
