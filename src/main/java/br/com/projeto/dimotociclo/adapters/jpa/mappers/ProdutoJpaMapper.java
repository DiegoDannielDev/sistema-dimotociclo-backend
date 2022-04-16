package br.com.projeto.dimotociclo.adapters.jpa.mappers;

import br.com.projeto.dimotociclo.adapters.core.impl.model.ProdutoModel;
import br.com.projeto.dimotociclo.adapters.jpa.entity.ProdutoEntity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProdutoJpaMapper {

    public static ProdutoEntity mapperToEntity(ProdutoModel produtoModel) {
        if (Objects.isNull(produtoModel)) {
            return null;
        }
        return ProdutoEntity.builder()
                .id(produtoModel.getIdProduto())
                .descricaoProduto(produtoModel.getDescricaoProduto())
                .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
                .valorEntrada(produtoModel.getValorEntrada())
                .build();
    }


    public static List<ProdutoEntity> mapperToEntity(List<ProdutoModel> produtoModels) {
        if (produtoModels.isEmpty()) {
            return Collections.emptyList();
        }
        return produtoModels.stream().map(ProdutoJpaMapper::mapperToEntity).collect(Collectors.toList());

    }




    public static ProdutoModel mapperToDto(ProdutoEntity produtoModel) {
        if (Objects.isNull(produtoModel)) {
            return null;
        }
        return ProdutoModel.builder()
                .idProduto(produtoModel.getId())
                .descricaoProduto(produtoModel.getDescricaoProduto())
                .quantidadeEntrada(produtoModel.getQuantidadeEntrada())
                .valorEntrada(produtoModel.getValorEntrada())
                .build();
    }


    public static List<ProdutoModel> mapperToModel(List<ProdutoEntity> responseList) {
        if (responseList.isEmpty()) {
            return Collections.emptyList();
        }
        return responseList.stream().map(ProdutoJpaMapper::mapperToDto).collect(Collectors.toList());

    }
}
