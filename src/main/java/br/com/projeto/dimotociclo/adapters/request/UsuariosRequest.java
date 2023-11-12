package br.com.projeto.dimotociclo.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Email;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UsuariosRequest {

    private Integer codigo;
    @NotEmpty(message = "Nome e obrigatorio")
    private String nome;
    @NotEmpty(message = "Login e obrigatorio")
    private String login;
    @NotEmpty(message = "Senha e obrigatorio")
    private String senha;
    private String telefone;
    @Email(message = "Digite um e-mail valido")
    private String email;
}
