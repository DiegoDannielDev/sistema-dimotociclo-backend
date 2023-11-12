package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class X509Data implements Serializable {
    @JsonIgnoreProperties("X509Certificate")
    public String x509Certificate;
}
