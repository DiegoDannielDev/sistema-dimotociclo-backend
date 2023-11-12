package br.com.projeto.dimotociclo.adapters.web;

import br.com.projeto.dimotociclo.adapters.request.nfe.NfeProcRequest;
import br.com.projeto.dimotociclo.infraestructure.mappers.NotaFiscalMapper;
import br.com.projeto.dimotociclo.infraestructure.service.LerXmlServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nota_fiscal")
@RequiredArgsConstructor
public class NotaFiscalController {

    private final LerXmlServiceImpl lerXmlService;
    private final NotaFiscalMapper notaFiscalMapper;

    @PostMapping(value = "/entrada_nfe", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<NfeProcRequest> entradaMercadoriaXml(
            @RequestParam("documento") String documento) {
        return ResponseEntity.ok(notaFiscalMapper.toResquest(lerXmlService.lerXml(documento)));
    }
}
