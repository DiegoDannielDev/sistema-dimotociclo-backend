package br.com.projeto.dimotociclo.adapters.web;

import br.com.projeto.dimotociclo.adapters.mappers.UsuarioMappers;
import br.com.projeto.dimotociclo.adapters.request.UsuariosRequest;
import br.com.projeto.dimotociclo.adapters.response.UsuariosResponse;
import br.com.projeto.dimotociclo.domain.usecases.UsuariosServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
@Slf4j
public class UsuariosController {

  private final UsuariosServices usuariosServices;
  private final UsuarioMappers mappers;

  @GetMapping(value = "/buscar-usuario", produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<UsuariosResponse> listarUsuario(
      @RequestParam(name = "nome") String nome, @RequestParam(name = "senha") String senha) {
    log.info("Passei por aqui ");
    return ResponseEntity.ok(mappers.toRequest(usuariosServices.buscarUsuario(nome, senha)));
  }

  @GetMapping(value = "/buscar_todos_usuario", produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<List<UsuariosResponse>> listarTodosUsuario() {
    log.info("Passei por aqui ");
    return ResponseEntity.ok(mappers.toRequestList(usuariosServices.buscarTodosUsuarios()));
  }

  @PostMapping(
      value = "/salvar_usuarios",
      produces = APPLICATION_JSON_VALUE,
      consumes = APPLICATION_JSON_VALUE)
  public ResponseEntity<UsuariosResponse> salvarUsuario(
      @RequestBody UsuariosRequest usuariosRequest) {
    return ResponseEntity.ok(
        mappers.toRequest(usuariosServices.salvar(mappers.toDTO(usuariosRequest))));
  }
}
