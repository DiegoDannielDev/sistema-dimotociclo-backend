package br.com.projeto.dimotociclo.adapters.core.impl;

import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.NfeProc;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class LerXmlService {

  public void lerXml() {
    try {

      var arquivo =
          Files.readString(
              Path.of("src/main/resources/NFe42220479133583000260550030000627411451218617.xml"),
              StandardCharsets.UTF_8);
      var xml = new XmlMapper().readValue(arquivo, new TypeReference<NfeProc>() {});

      System.out.println("%s" + xml.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String xml() {
    return "";
  }
}
