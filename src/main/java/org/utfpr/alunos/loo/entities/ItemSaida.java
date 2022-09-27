package org.utfpr.alunos.loo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_item_saida")
public class ItemSaida extends Entidade {
    
    @NotEmpty
    @NotNull
    @Size(max = 45)
    private String lote;
    @NotNull
    @Size(min = 1)
    private Integer qtde;
    @Column(precision = 2)
    @NotNull
    @Size(min = 0)
    private Float valor;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Saida saida;
    public String getLote() {
        return lote;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }
    public Integer getQtde() {
        return qtde;
    }
    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Saida getSaida() {
        return saida;
    }
    public void setSaida(Saida saida) {
        this.saida = saida;
    }
    
}
