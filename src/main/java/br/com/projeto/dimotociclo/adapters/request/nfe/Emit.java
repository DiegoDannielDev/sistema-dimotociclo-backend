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
public class Emit {
    @JsonProperty("CNPJ")
    public String cNPJ;

    public String xNome;
    public EnderEmit enderEmit;

    @JsonProperty("IE")
    public String iE;

    @JsonProperty("CRT")
    public String cRT;
}
