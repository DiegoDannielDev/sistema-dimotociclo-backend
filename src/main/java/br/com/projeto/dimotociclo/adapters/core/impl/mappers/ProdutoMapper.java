package br.com.projeto.dimotociclo.adapters.core.impl.mappers;

import br.com.projeto.dimotociclo.adapters.adapters.controllers.request.ProdutoRequest;
import br.com.projeto.dimotociclo.adapters.adapters.controllers.response.ProdutoResponse;
import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProdutoMapper {

    public static ProdutoResponse mapperToResponse(ProdutoModel produtoModel) {
        if (Objects.isNull(produtoModel)) {
            return null;
        }
        return ProdutoResponse.builder()
                .idProduto(produtoModel.getIdProduto())
                .descricaoProduto(produtoModel.getDescricaoProduto())
                .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
                .valorEntrada(produtoModel.getValorEntrada())
                .build();
    }


    public static List<ProdutoResponse> mapperToResponse(List<ProdutoModel> produtoModels) {
        if (produtoModels.isEmpty()) {
            return Collections.emptyList();
        }
        return produtoModels.stream().map(ProdutoMapper::mapperToResponse).collect(Collectors.toList());

    }




    public static ProdutoModel mapperToDto(ProdutoRequest produtoModel) {
        if (Objects.isNull(produtoModel)) {
            return null;
        }
        return ProdutoModel.builder()
                .descricaoProduto(produtoModel.getDescricaoProduto())
                .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
                .valorEntrada(produtoModel.getValorEntrada())
                .build();
    }


    public static List<ProdutoModel> mapperToRequest(List<ProdutoRequest> responseList) {
        if (responseList.isEmpty()) {
            return Collections.emptyList();
        }
        return responseList.stream().map(ProdutoMapper::mapperToDto).collect(Collectors.toList());

    }
}
