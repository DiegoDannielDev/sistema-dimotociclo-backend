package br.com.projeto.dimotociclo.adapters.controllers.request.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NfeProcRequest {
  @JsonProperty("NFe")
  public NFe nFe;

  @JsonProperty("protNFe")
  public ProtNFe protNFe;

  @JsonIgnoreProperties("_xmlns")
  public String _xmlns;

  @JsonIgnoreProperties("_versao")
  public String _versao;
}
