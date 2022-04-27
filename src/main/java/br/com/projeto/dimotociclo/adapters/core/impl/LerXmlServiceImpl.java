package br.com.projeto.dimotociclo.adapters.core.impl;

import br.com.projeto.dimotociclo.adapters.core.impl.mappers.MapperProduto;
import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.NfeProc;
import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.Prod;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class LerXmlServiceImpl {

  private final ProdutoUseCaseImpl produtoUseCase;
  private final MapperProduto mapperProduto;

  public NfeProc lerXml(String arquivo) {
    try {

      var xml =
          new XmlMapper()
              .registerModule(new JacksonXmlModule())
              .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      var json = xml.readValue(arquivo, NfeProc.class);
      System.out.println("%s" + json);
      json.getNFe()
          .getInfNFe()
          .getDet()
          .forEach(
              det -> {
                for (var pro : det.prod) {
                  salvarProduto(pro);
                }
              });

      return json;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public ProdutoModel salvarProduto(Prod prod) {
    return produtoUseCase.salvarProduto(mapperProduto.toModel(prod));
  }
}
