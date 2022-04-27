package br.com.projeto.dimotociclo.adapters.controllers;

import br.com.projeto.dimotociclo.adapters.controllers.request.nfe.NfeProcRequest;
import br.com.projeto.dimotociclo.adapters.core.impl.LerXmlServiceImpl;
import br.com.projeto.dimotociclo.adapters.core.impl.mappers.NotaFiscalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nota_fiscal")
@RequiredArgsConstructor
public class NotaFiscalController {

  private final LerXmlServiceImpl lerXmlService;
  private final NotaFiscalMapper notaFiscalMapper;

  @PostMapping(value = "/entrada_nfe", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<NfeProcRequest> entradaMercadoriaXml(@RequestBody String documento) {
    return ResponseEntity.ok(notaFiscalMapper.toResquest(lerXmlService.lerXml(documento)));
  }
}
