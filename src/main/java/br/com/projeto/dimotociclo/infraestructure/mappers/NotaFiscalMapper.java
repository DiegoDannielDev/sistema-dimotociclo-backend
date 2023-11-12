package br.com.projeto.dimotociclo.infraestructure.mappers;

import br.com.projeto.dimotociclo.adapters.request.nfe.NfeProcRequest;
import br.com.projeto.dimotociclo.domain.model.nfe.NfeProc;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaFiscalMapper {

    NfeProcRequest toResquest(NfeProc proc);
}
