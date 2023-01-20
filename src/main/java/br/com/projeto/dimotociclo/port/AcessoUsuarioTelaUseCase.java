package br.com.projeto.dimotociclo.port;

import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;

public interface AcessoUsuarioTelaUseCase {

  AcessoUsuarioTelaModel salvarAcesso(AcessoUsuarioTelaModel usuarioTelaModel);

  AcessoTelaPermissaoModel isPermissaoAcesso(String tela, Long codigoUsuario);
}
