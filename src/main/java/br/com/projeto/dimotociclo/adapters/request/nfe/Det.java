package br.com.projeto.dimotociclo.adapters.request.nfe;

import br.com.projeto.dimotociclo.domain.model.nfe.Prod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Det {
    @JsonProperty("prod")
    public List<Prod> prod;

    @JsonProperty("imposto")
    public Imposto imposto;

    @JsonIgnoreProperties("_nItem")
    public String _nItem;
}
