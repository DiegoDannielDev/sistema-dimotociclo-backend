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
public class SignedInfo {
    @JsonProperty("CanonicalizationMethod")
    public CanonicalizationMethod canonicalizationMethod;

    @JsonProperty("SignatureMethod")
    public SignatureMethod signatureMethod;

    @JsonProperty("Reference")
    public Reference reference;
}
