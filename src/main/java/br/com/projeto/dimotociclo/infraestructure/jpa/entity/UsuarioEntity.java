package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity(name = "usuario")
@Table(
        name = "usuario",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"login"},
                        name = "fk_login")
        })
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long codigo;

    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;
}
