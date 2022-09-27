package org.utfpr.alunos.loo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Entidade {
    
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String nome;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String telefone;
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String endereco;
    @NotNull
    @NotEmpty
    @Size(max = 14)
    private String cpf;

    @OneToMany(mappedBy = "funcionario")
    private List<Saida> saidas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<Saida> getSaidas() {
        return saidas;
    }
    public void setSaidas(List<Saida> saidas) {
        this.saidas = saidas;
    }
    

}
