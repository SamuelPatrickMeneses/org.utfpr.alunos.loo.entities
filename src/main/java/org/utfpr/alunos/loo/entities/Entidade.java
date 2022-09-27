package org.utfpr.alunos.loo.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import jakarta.validation.constraints.Size;


@MappedSuperclass
public class Entidade implements Comparable<Entidade>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(min = 0)
    private Long id;

    @Override
    public int compareTo(Entidade arg0){
        if(getClass().equals(arg0.getClass())){
            if(id > arg0.id)
                return 1;
            if(id == arg0.id)
                return 0;
        }
        return -1;
        
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isNew() {
		return this.id == null;
	}
}
