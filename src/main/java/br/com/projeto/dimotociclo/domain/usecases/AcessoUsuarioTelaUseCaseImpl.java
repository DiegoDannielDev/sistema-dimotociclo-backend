package br.com.projeto.dimotociclo.domain.usecases;

import br.com.projeto.dimotociclo.adapters.integration.jpa.port.AcessoUsuarioTelaPort;
import br.com.projeto.dimotociclo.domain.model.AcessoTelaPermissaoModel;
import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
import br.com.projeto.dimotociclo.port.AcessoUsuarioTelaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AcessoUsuarioTelaUseCaseImpl implements AcessoUsuarioTelaUseCase {
  private final AcessoUsuarioTelaPort usuarioTelaPort;
  private final UsuariosServices usuariosServices;

  public AcessoUsuarioTelaModel salvarAcesso(AcessoUsuarioTelaModel usuarioTelaModel) {
    buscarUsuario(usuarioTelaModel.getCodigoUsuario());
    return this.usuarioTelaPort.salvarAcessoTela(usuarioTelaModel);
  }

  public AcessoTelaPermissaoModel isPermissaoAcesso(String tela, Long codigoUsuario) {

    buscarUsuario(codigoUsuario);
    var userPermiss =
        usuarioTelaPort.isAcessoPermitido(codigoUsuario).stream()
            .filter(Objects::nonNull)
            .filter(usuarioTelaModel -> usuarioTelaModel.getNomeTela().equalsIgnoreCase(tela))
            .filter(AcessoUsuarioTelaModel::getIsPermissao)
            .collect(Collectors.toList());
    return !userPermiss.isEmpty()
        ? AcessoTelaPermissaoModel.builder().message("true").build()
        : AcessoTelaPermissaoModel.builder().message("false").build();
  }

  private void buscarUsuario(Long id) {
    this.usuariosServices.buscarUsuarioId(id);
  }
}
