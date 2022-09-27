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
@Table(name = "tb_produto")
public class Produto extends Entidade {
    
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String descricao;

    @NotNull
    @Column(precision = 5)
    private Float peso;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String controlado;

    @NotNull
    @Column(name = "qtd_min")
    private Integer qtMin;

    @ManyToOne
    @Column(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @Column(name = "id_fornecedor")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "produto")
    private List<ItemSaida> itemSaida;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getControlado() {
        return controlado;
    }

    public void setControlado(String controlado) {
        this.controlado = controlado;
    }

    public Integer getQtMin() {
        return qtMin;
    }

    public void setQtMin(Integer qtMin) {
        this.qtMin = qtMin;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ItemSaida> getItemSaida() {
        return itemSaida;
    }

    public void setItemSaida(List<ItemSaida> itemSaida) {
        this.itemSaida = itemSaida;
    } 
    
}
