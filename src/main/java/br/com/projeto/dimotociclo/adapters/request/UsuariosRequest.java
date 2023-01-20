package br.com.projeto.dimotociclo.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UsuariosRequest {

  private Integer codigo;
  private String nome;
  private String login;
  private String senha;
  private String telefone;
  private String email;
}
