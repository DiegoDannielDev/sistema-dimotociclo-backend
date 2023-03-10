package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Signature {
  @JsonIgnoreProperties public SignedInfo signedInfo;
  @JsonIgnoreProperties public String signatureValue;
  @JsonIgnoreProperties public KeyInfo keyInfo;

  @JsonIgnoreProperties("_xmlns")
  public String _xmlns;
}
