package br.com.projeto.dimotociclo.adapters.web;

import br.com.projeto.dimotociclo.adapters.mappers.AcessoUsuarioTelaMappers;
import br.com.projeto.dimotociclo.adapters.request.AcessoUsuarioTelaRequest;
import br.com.projeto.dimotociclo.adapters.response.AcessoTelaPermissaoResponse;
import br.com.projeto.dimotociclo.port.AcessoUsuarioTelaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/acessos-tela")
@RequiredArgsConstructor
public class AcessoUsuarioTelaController {
  private final AcessoUsuarioTelaUseCase usuarioTelaService;
  private final AcessoUsuarioTelaMappers usuarioTelaMapper;

  @ResponseStatus(HttpStatus.OK)
  @PostMapping
  public void savarAcesso(@RequestBody AcessoUsuarioTelaRequest acessoUsuarioTelaRequest) {
    usuarioTelaService.salvarAcesso(this.usuarioTelaMapper.toModel(acessoUsuarioTelaRequest));
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/permissao")
  public AcessoTelaPermissaoResponse validarAcesso(
      @RequestParam String nomeTela, @RequestParam Long codigoUsuario) {
    return this.usuarioTelaMapper.mapperToResponse(
        usuarioTelaService.isPermissaoAcesso(nomeTela, codigoUsuario));
  }
}
