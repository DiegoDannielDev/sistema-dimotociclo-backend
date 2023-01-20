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
public class Reference {
  @JsonProperty("Transforms")
  public Transforms transforms;

  @JsonProperty("DigestMethod")
  public DigestMethod digestMethod;

  @JsonProperty("DigestValue")
  public String digestValue;

  public String _URI;
}
