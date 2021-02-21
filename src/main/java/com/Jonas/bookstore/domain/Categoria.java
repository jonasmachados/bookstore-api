package com.Jonas.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * created 21/02/2021
 */
public class Categoria {

    private Integer id;
    private String nome;
    private String descricao;

    private List<Livro> livros = new ArrayList<>();
    
    //CONSTRUCTOR
    public Categoria() {
    }
    //CONSTRUCTOR
    public Categoria(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    //EQUALS AND HASHCODE
    @Override    
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }
    @Override    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    //GET AND SET
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    

    

    
}
