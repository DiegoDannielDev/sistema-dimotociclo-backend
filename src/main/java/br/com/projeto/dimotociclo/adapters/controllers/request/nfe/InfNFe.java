package br.com.projeto.dimotociclo.adapters.controllers.request.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

  @JsonIgnoreProperties("_Id")
  public String _Id;

  @JsonIgnoreProperties("_versao")
  public String _versao;
}
