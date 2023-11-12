package br.com.projeto.dimotociclo.adapters.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UsuariosResponse {

    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;
    private String password;
}
