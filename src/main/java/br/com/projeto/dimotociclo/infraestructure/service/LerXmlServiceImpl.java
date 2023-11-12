package br.com.projeto.dimotociclo.infraestructure.service;

import br.com.projeto.dimotociclo.domain.model.nfe.NfeProc;
import br.com.projeto.dimotociclo.infraestructure.mappers.MapperProduto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
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
            log.info("{}", json);
//      json.getNFe().getInfNFe().getDet().forEach(det -> det.prod.forEach(this::salvarProduto));
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

//  public void salvarProduto(Prod prod) {
//    produtoUseCase.salvarProduto(mapperProduto.toModel(prod));
//  }
}
