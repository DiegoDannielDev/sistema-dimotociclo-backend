package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.crypto.dsig.keyinfo.X509Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyInfo {
  @JsonIgnoreProperties public X509Data x509Data;
}
