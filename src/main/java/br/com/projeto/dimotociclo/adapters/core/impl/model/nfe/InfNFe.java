package br.com.projeto.dimotociclo.adapters.core.impl.model.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

  @JacksonXmlProperty(localName = "det")
  @JacksonXmlCData
  @JacksonXmlElementWrapper(useWrapping = false)
  public ArrayList<Det> det;

  public Total total;
  public Transp transp;
  public Pag pag;
  public InfAdic infAdic;
  public InfRespTec infRespTec;

  @JsonIgnoreProperties("Id")
  public String _Id;

  @JsonIgnoreProperties("versao")
  public String _versao;
}
