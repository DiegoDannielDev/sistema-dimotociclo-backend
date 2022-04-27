package br.com.projeto.dimotociclo.adapters.controllers;

import br.com.projeto.dimotociclo.adapters.controllers.request.UsuariosRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

  @GetMapping("/get")
  public ResponseEntity<UsuariosRequest> listarTodosProdutos() {
    return ResponseEntity.ok(
        UsuariosRequest.builder().codigo(1).login("diego").nome("danniel").senha("dasdas").build());
  }
}
