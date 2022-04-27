package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfNFe {
  public Ide ide;
  public Emit emit;
  public Dest dest;
  public ArrayList<Det> det;
  public Total total;
  public Transp transp;
  public Pag pag;
  public InfAdic infAdic;
  public InfRespTec infRespTec;
  @JsonIgnoreProperties public String _Id;
  @JsonIgnoreProperties public String _versao;
}
