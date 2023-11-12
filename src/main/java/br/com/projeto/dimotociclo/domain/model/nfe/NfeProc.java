package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NfeProc {
    @JsonProperty("NFe")
    public NFe nFe;

    @JsonProperty("protNFe")
    public ProtNFe protNFe;

    @JsonProperty("xmlns")
    public String _xmlns;

    @JsonProperty("versao")
    public String _versao;
}
