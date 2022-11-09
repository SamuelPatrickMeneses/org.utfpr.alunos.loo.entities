package org.utfpr.alunos.loo.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_item_entrada")
public class ItemEntrada extends Entidade {

    @NotEmpty
    @Size(max = 45)
    private String lote;

    @NotNull
    private Integer quantidade;
    
    @NotNull
    @Column(precision = 2)
    private BigDecimal valor;

    @ManyToOne
    @Column(name = "id_produto")
    private Produto produto;

    @ManyToOne
    @Column(name = "id_entrada")
    private Entrada entrada;

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    

    
}
