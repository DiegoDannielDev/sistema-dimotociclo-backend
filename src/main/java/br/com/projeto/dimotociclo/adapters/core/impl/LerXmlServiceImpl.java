package br.com.projeto.dimotociclo.adapters.core.impl;

import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.NfeProc;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LerXmlServiceImpl {

  public NfeProc lerXml(String arquivo) {
    try {

      //      var arquivo =
      //          Files.readString(
      //
      // Path.of("src/main/resources/NFe42220479133583000260550030000627411451218617.xml"),
      //              StandardCharsets.UTF_8);
      var xml = new XmlMapper().readValue(arquivo, new TypeReference<NfeProc>() {});

      System.out.println("%s" + xml.toString());
      return xml;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
