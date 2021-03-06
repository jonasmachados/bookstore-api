package com.Jonas.bookstore.dtos;

import com.Jonas.bookstore.domain.Livro;
import java.io.Serializable;

/**
 *
 * @author Jonas, created 06/03/2021
 */
public class LivroDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;

    //CONSTRUCTOR
    public LivroDTO() {
    }

    //CONSTRUCTOR
    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
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

}
