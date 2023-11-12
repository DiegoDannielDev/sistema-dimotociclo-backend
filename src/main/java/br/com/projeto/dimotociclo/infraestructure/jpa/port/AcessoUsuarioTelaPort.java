package br.com.projeto.dimotociclo.infraestructure.jpa.port;

import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;

import java.util.List;

public interface AcessoUsuarioTelaPort {

    AcessoUsuarioTelaModel salvarAcessoTela(AcessoUsuarioTelaModel usuarioTelaModel);

    List<AcessoUsuarioTelaModel> isAcessoPermitido(Long codigoUsuario);

    boolean deletarAcessoUsuario(Long codigoUsuario);
}
