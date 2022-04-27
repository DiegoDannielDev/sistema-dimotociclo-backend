package br.com.projeto.dimotociclo.adapters.core.impl.mappers;

import br.com.projeto.dimotociclo.adapters.controllers.request.nfe.NfeProcRequest;
import br.com.projeto.dimotociclo.adapters.core.impl.model.nfe.NfeProc;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaFiscalMapper {

  NfeProcRequest toResquest(NfeProc proc);
}
