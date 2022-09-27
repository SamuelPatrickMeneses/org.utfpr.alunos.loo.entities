package org.utfpr.alunos.loo.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria extends Entidade {
    @Size(max = 45)
    @NotNull
    @NotEmpty
    private String categoria;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
