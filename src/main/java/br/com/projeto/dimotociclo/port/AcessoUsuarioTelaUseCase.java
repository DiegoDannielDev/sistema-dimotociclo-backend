package br.com.projeto.dimotociclo.port;

import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import br.com.projeto.dimotociclo.domain.model.UsuarioAcessosModel;

import java.util.List;

public interface AcessoUsuarioTelaUseCase {

    void salvarAcesso(UsuarioAcessosModel usuarioTelaModel);

    AcessoTelaPermissaoModel isPermissaoAcesso(String tela, Long codigoUsuario);
}
