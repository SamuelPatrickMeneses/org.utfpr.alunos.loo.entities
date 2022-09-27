package org.utfpr.alunos.loo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_saida")
public class Saida extends Entidade{
    
    @NotNull
    @Column(precision = 2)
    private Float total;

    @NotNull
    @Column(precision = 2)
    private Float inposto;
    @NotNull
    @ManyToOne
    @Column(name = "id_funcionario")
    private Funcionario funcionario;

    @NotNull
    @ManyToOne
    @Column(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "saida")
    private List<ItemSaida> itemSaida;

    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public Float getInposto() {
        return inposto;
    }
    public void setInposto(Float inposto) {
        this.inposto = inposto;
    }
    public List<ItemSaida> getItemSaida() {
        return itemSaida;
    }
    public void setItemSaida(List<ItemSaida> itemSaida) {
        this.itemSaida = itemSaida;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
