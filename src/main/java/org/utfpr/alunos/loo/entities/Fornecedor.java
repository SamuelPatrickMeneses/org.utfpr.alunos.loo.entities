package org.utfpr.alunos.loo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor extends Entidade {
    
    @NotEmpty
    @Size(max = 45)
    private String descricao;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String endereco;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String bairo;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String cnpg;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String contato;

    @NotNull
    @ManyToOne
    @Column(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

    public String getCnpg() {
        return cnpg;
    }

    public void setCnpg(String cnpg) {
        this.cnpg = cnpg;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
     
    
}
