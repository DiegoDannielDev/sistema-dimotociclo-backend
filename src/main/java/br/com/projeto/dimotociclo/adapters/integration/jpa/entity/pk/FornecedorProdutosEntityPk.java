package br.com.projeto.dimotociclo.adapters.integration.jpa.entity.pk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FornecedorProdutosEntityPk implements Serializable {

  @Column(columnDefinition = "codigo_fornecedore")
  private Long fornecedores;

  @Column(columnDefinition = "codigo_produto")
  private Long produtoEntity;
}
