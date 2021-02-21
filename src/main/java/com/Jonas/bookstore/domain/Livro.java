package com.Jonas.bookstore.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * created 21/02/2021
 */

@Entity
public class Livro implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String nomeAuthor;
    private String texto;

    @ManyToOne //Anotacao para associacao 
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //CONSTRUCTOR
    public Livro() {
    }

    //CONSTRUCTOR
    public Livro(Integer id, String titulo, String nomeAuthor, String texto, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nomeAuthor = nomeAuthor;
        this.texto = texto;
        this.categoria = categoria;
    }

    //EQUALS AND HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    //GET AND SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAuthor() {
        return nomeAuthor;
    }

    public void setNomeAuthor(String nomeAuthor) {
        this.nomeAuthor = nomeAuthor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
