package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ICMS {
    @JsonProperty("ICMS00")
    public ICMS00 iCMS00;

    @JsonProperty("ICMS20")
    public ICMS20 iCMS20;
}
