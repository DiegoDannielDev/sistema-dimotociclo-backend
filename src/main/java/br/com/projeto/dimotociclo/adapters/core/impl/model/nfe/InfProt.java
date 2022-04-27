package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfProt {
  public String tpAmb;
  public String verAplic;
  public String chNFe;
  public Date dhRecbto;
  public String nProt;
  public String digVal;
  public String cStat;
  public String xMotivo;
}
