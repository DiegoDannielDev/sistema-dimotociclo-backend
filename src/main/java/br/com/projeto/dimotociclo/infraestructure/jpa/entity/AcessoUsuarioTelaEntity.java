package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
@Entity(name = "acessoUsuarioTela")
public class AcessoUsuarioTelaEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Boolean isPermissao;
    private String nomeTela;

    private Long codigoUsuario;
    ;
}
