package br.com.projeto.dimotociclo.domain.model.nfe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Det {
  @JacksonXmlProperty(localName = "prod")
  @JacksonXmlCData
  @JacksonXmlElementWrapper(useWrapping = false)
  public List<Prod> prod;

  @JsonProperty("imposto")
  public Imposto imposto;

  @JacksonXmlProperty(localName = "nItem")
  public String nItem;
}
