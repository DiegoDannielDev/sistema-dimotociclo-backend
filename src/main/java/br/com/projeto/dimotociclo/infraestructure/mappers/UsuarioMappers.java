package br.com.projeto.dimotociclo.infraestructure.mappers;

import br.com.projeto.dimotociclo.adapters.request.UsuariosRequest;
import br.com.projeto.dimotociclo.adapters.response.UsuariosResponse;
import br.com.projeto.dimotociclo.domain.model.UsuarioModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMappers {
    UsuariosResponse toRequest(UsuarioModel usuarioModel);

    UsuarioModel toDTO(UsuariosRequest usuariosRequest);

    List<UsuariosResponse> toRequestList(List<UsuarioModel> usuarioModel);

    List<UsuariosResponse> toResponse(List<UsuariosRequest> usuarioModel);
}
