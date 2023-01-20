package br.com.projeto.dimotociclo.domain.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AcessoUsuarioTelaModel {

  private Long id;
  private Boolean isPermissao;
  private String nomeTela;
  private Long codigoUsuario;
}
