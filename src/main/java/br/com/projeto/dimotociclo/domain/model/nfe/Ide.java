package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ide {
  public String cUF;
  public String cNF;
  public String natOp;
  public String mod;
  public String serie;
  public String nNF;
  public Date dhEmi;
  public Date dhSaiEnt;
  public String tpNF;
  public String idDest;
  public String cMunFG;
  public String tpImp;
  public String tpEmis;
  public String cDV;
  public String tpAmb;
  public String finNFe;
  public String indFinal;
  public String indPres;
  public String indIntermed;
  public String procEmi;
  public String verProc;
}
