package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;

import br.com.projeto.dimotociclo.domain.model.ProdutoDTO;
import br.com.projeto.dimotociclo.domain.model.ProdutoModel;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.*;
import br.com.projeto.dimotociclo.infraestructure.jpa.entity.pk.FornecedorProdutosEntityPk;
import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.ProdutosComprasJpaMapper;
import br.com.projeto.dimotociclo.infraestructure.jpa.port.ProdutoPort;
import br.com.projeto.dimotociclo.infraestructure.jpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProdutoRepositoryImpl implements ProdutoPort {

    private final ProdutoRepositoryJPA repositoryJPA;
    private final EstoqueProdutoRepositoryJPA estoqueProdutoJPA;
    private final FornecedorProdutoRepositoryJPA fornecedorProdutoJPA;
    private final ProdutoCodigoBarrasRepositoryJPA produtoCodigoBarrasJPA;
    private final ValoresProdutosRepositoryJPA valoresProdutosJPA;
    private final ProdutosComprasJpaMapper mapper;

    @Override
    public ProdutoModel salvar(ProdutoDTO estoqueModel) {
        var produtoSave =
                repositoryJPA.save(
                        ProdutoEntity.builder()
                                .descricaoProduto(estoqueModel.getDescricaoProduto())
                                .produtoMarca(estoqueModel.getProdutoMarca())
                                .categoria(estoqueModel.getCategoria())
                                .urlImagen(estoqueModel.getUrlImagen())
                                .situacaoProduto(estoqueModel.getSituacaoProduto())
                                .build());

        estoqueModel.setCodigoProduto(produtoSave.getProdutoId());

        return mapper.mapperToDto(
                ProdutoEntity.builder()
                        .descricaoProduto(estoqueModel.getDescricaoProduto())
                        .produtoMarca(estoqueModel.getProdutoMarca())
                        .categoria(estoqueModel.getCategoria())
                        .urlImagen(estoqueModel.getUrlImagen())
                        .situacaoProduto(estoqueModel.getSituacaoProduto())
                        .valoresProdutos(this.salvarValorProduto(estoqueModel, produtoSave))
                        .codigoBarras(this.saveCodigoBarrasEntity(estoqueModel, produtoSave))
                        .estoqueProduto(this.salvarProdutoEstoque(estoqueModel, produtoSave))
                        .build());
    }

    private EstoqueProdutoEntity salvarProdutoEstoque(
            ProdutoDTO produtoDTO, ProdutoEntity produtoEntity) {
        return this.estoqueProdutoJPA.save(
                EstoqueProdutoEntity.builder()
                        .produtoEntity(produtoEntity)
                        .unidadeMedida(produtoDTO.getUnidadeMedida())
                        .quantidadeEstoqueProduto(produtoDTO.getQuantidadeEstoqueProduto())
                        .quantidadeMaximaEstoque(produtoDTO.getQuantidadeMaximaEstoque())
                        .quantidadeMinimaEstoque(produtoDTO.getQuantidadeMinimaEstoque())
                        .dataInclusao(LocalDateTime.now())
                        .build());
    }

    private FornecedorProdutosEntity salvarFornecedorProdutosEntity(ProdutoDTO produtoDTO) {
        return this.fornecedorProdutoJPA.save(
                FornecedorProdutosEntity.builder()
                        .fornecedorProdutosEntityPk(
                                new FornecedorProdutosEntityPk(
                                        produtoDTO.getCodigoFornecedor(), produtoDTO.getCodigoProduto()))
                        .build());
    }

    private ValoresProdutosEntity salvarValorProduto(
            ProdutoDTO produtoDTO, ProdutoEntity produtoEntity) {
        return this.valoresProdutosJPA.save(
                ValoresProdutosEntity.builder()
                        .produtoEntity(produtoEntity)
                        .dataInclusao(LocalDateTime.now())
                        .valorVendaVarejo(produtoDTO.produtoValores.getValorVendaVarejo())
                        .valorLucroVendaVarejo(produtoDTO.produtoValores.getValorLucroVendaVarejo())
                        .valorLucroVendaAtacadado(produtoDTO.produtoValores.getValorLucroVendaAtacadado())
                        .valorCompraProdutoUnitario(produtoDTO.produtoValores.getValorCompraProdutoUnitario())
                        .margemVendaAtacado(produtoDTO.produtoValores.getMargemVendaAtacado())
                        .margemVendaVarejo(produtoDTO.produtoValores.getMargemVendaVarejo())
                        .valorCompra(produtoDTO.produtoValores.getValorTotalCompra())
                        .valorAtacado(produtoDTO.produtoValores.getValorVendaAtacado())
                        .build());
    }

    private ProdutoCodigoBarrasEntity saveCodigoBarrasEntity(
            ProdutoDTO produtoDTO, ProdutoEntity produtoEntity) {
        return this.produtoCodigoBarrasJPA.save(
                ProdutoCodigoBarrasEntity.builder()
                        .codigoBarrasExterno(produtoDTO.getCodigoBarras())
                        .codigoBarrasInterno(produtoDTO.getCodigoBarrasInterno())
                        .dataInclusao(LocalDateTime.now())
                        .produtoEntity(produtoEntity)
                        .build());
    }

    @Override
    public List<ProdutoModel> listarTodosProdutos() {
        return repositoryJPA.findAll().stream().map(mapper::mapperToDto).collect(Collectors.toList());
    }

    @Override
    public List<ProdutoModel> listarPorIdProduto(Long idProduto) {
        return repositoryJPA.buscarIdProduto(idProduto).stream()
                .map(mapper::mapperToDto)
                .collect(Collectors.toList());
    }
}
