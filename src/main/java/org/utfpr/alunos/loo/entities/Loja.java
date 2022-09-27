package org.utfpr.alunos.loo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_loja")
public class Loja extends Entidade {
    
    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String endereco;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String mome;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    @Column(name = "end_numero")
    private String endNumero;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String bairro;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String telefone;

    @NotNull
    @NotEmpty
    @Size(max = 45)
    private String cnpj;

    @NotNull
    @ManyToOne
    @Column(name = "id_cidade")
    private Cidade cidade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    


}
