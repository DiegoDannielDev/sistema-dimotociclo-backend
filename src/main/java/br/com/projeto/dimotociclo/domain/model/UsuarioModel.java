package br.com.projeto.dimotociclo.domain.model;

import br.com.projeto.dimotociclo.adapters.request.UsuariosRequest;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class UsuarioModel {

    private Integer codigo;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;



}
