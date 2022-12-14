package org.utfpr.alunos.loo.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_entidade")
public class Entrada extends Entidade {
    @NotNull
    @Column(name = "data_entrada")
    private LocalDate dataEntrada;
    @NotNull
    @Column(precision = 2)
    private BigDecimal total;
    @Size(max = 45)
    @NotNull
    @NotEmpty
    private String numNotaFiscal;
    @NotNull
    @Column(precision = 2)
    private BigDecimal imposto;

    @OneToMany(mappedBy = "entrada")
    private List<ItemEntrada> itemEntrada;

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNumNotaFiscal() {
        return numNotaFiscal;
    }
    public void setNumNotaFiscal(String numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public BigDecimal getImposto() {
        return imposto;
    }
    public void setImposto(BigDecimal imposto) {
        this.imposto = imposto;
    }
    public List<ItemEntrada> getItemEntrada() {
        return itemEntrada;
    }
    public void setItemEntrada(List<ItemEntrada> itemEntrada) {
        this.itemEntrada = itemEntrada;
    }
    
}
