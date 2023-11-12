package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "produtoCodigoBarras")
@Data
public class ProdutoCodigoBarrasEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "produto_id", unique = true)
    private ProdutoEntity produtoEntity;

    private String codigoBarrasInterno;
    private String codigoBarrasExterno;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAlteracao;
}
