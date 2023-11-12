package br.com.projeto.dimotociclo.infraestructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "fornecedor")
public class FornecedorEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String nome;
    private String nomeFantasia;
    private String cpf;
    private String cnpj;
    private String tipo;
    private String situacao;
    private String endereco;
    private String cep;
    @Transient
    private List<String> numerosCtt;
}
