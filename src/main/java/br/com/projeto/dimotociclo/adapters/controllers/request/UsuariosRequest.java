package br.com.projeto.dimotociclo.adapters.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UsuariosRequest {

  private int codigo;
  private String nome;
  private String login;
  private String senha;
}
