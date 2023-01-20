package br.com.projeto.dimotociclo.domain.model.nfe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
