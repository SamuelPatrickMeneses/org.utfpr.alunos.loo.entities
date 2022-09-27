package org.utfpr.alunos.loo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_cidade")
public class Cidade extends Entidade {
    
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String descricao;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 2)
    private String uf;

    @OneToMany(mappedBy = "cidade")
    private List<Fornecedor> fornecedores;
    
    @OneToMany(mappedBy = "cidade")
    private List<Loja> lojas;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) throws InvalidValueExeption {
        Estado.valida(uf);
        this.uf = uf;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public List<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(List<Loja> lojas) {
        this.lojas = lojas;
    }
}
